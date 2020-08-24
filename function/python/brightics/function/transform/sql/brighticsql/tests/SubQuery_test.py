import pandas as pd
import unittest

from brighticsql.utils.unittest_util import table_cmp
from brighticsql.sqldf import BrighticSQL


class SubQueryTest(unittest.TestCase):

    def setUp(self):
        self.print_dfs = False
        self.check_row_order = False
        self.dept = pd.DataFrame({'deptno': [10, 20, 30, 40],
                                  'dname': ['ACCOUNTING', 'RESEARCH', 'SALES',
                                            'OPERATIONS'],
                                  'loc': ['NEW YORK', 'DALLAS', 'CHICAGO',
                                          'BOSTON']})
        self.emp = pd.DataFrame({'empno': [7839, 7698, 7782, 7566, 7788, 7902,
                                           7369, 7499, 7521, 7654, 7844, 7876,
                                           7900, 7934],
                                 'ename': ['KING', 'BLAKE', 'CLARK', 'JONES',
                                           'SCOTT', 'FORD', 'SMITH', 'ALLEN',
                                           'WARD', 'MARTIN', 'TURNER', 'ADAMS',
                                           'JAMES', 'MILLER'],
                                 'job': ['PRESIDENT', 'MANAGER', 'MANAGER',
                                         'MANAGER', 'ANALYST', 'ANALYST',
                                         'CLERK', 'SALESMAN', 'SALESMAN',
                                         'SALESMAN', 'SALESMAN', 'CLERK',
                                         'CLERK', 'CLERK'],
                                 'mgr': [None, 7839, 7839, 7839, 7566, 7566,
                                         7902, 7698, 7698, 7698, 7698, 7788,
                                         7698, 7782],
                                 'hiredate': ['1996-11-17', '1991-1-05',
                                              '1999-9-06', '2001-02-04',
                                              '2003-06-17', '1981-03-12',
                                              '2007-12-1', '20-2-1981',
                                              '22-2-1981', '28-9-1981',
                                              '8-9-1981', '13-7-1987',
                                              '3-12-1981', '2003-1-23'],
                                 'sal': [5000, 2850, 2450, 2975, 3000, 3000,
                                         800, 1600, 1250, 1250, 1500, 1100, 950,
                                         1300],
                                 's': [5, 3, 2, 3, 3, 3, 1, 2, 1, 1, 2, 1, 1,
                                       1],
                                 'comm': [None, None, None, None, None, None,
                                          None, '300', '500', '1400', '0', None,
                                          None, None],
                                 'deptno': [10, 30, 10, 20, 20, 20, 20, 30, 30,
                                            30, 30, 20, 30, 10]})

        self.input_tables = dict(dept=self.dept, emp=self.emp)
        self.port = 50051
        self.brtcsql = BrighticSQL()
        self.brtcsql.connect('grpc', self.port)
        self.brtcsql.set_tables(self.input_tables)

    # Inline View
    def test01(self):
        sql = """select e.ename, e.deptno, e.sal
                from emp e, (select deptno, max(sal) as max_sal
                             from emp group by deptno) i
                where e.deptno = i.deptno
                and e.sal = i.max_sal"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame({
            'ename': ['BLAKE', 'SCOTT', 'KING', 'FORD'],
            'deptno': [30, 20, 10, 20],
            'sal': [2850, 3000, 5000, 3000]})
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)

    # Single Row Subquery
    def test02(self):
        sql = """select empno, ename, job, sal, mgr, comm, deptno from emp
                 where sal > (select sal from emp where ename = 'ALLEN')"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame({
            'empno': [7566, 7698, 7782, 7788, 7839, 7902],
            'ename': ['JONES', 'BLAKE', 'CLARK', 'SCOTT', 'KING', 'FORD'],
            'JOB': ['MANAGER', 'MANAGER', 'MANAGER', 'ANALYST', 'PRESIDENT',
                    'ANALYST'],
            'sal': [2975, 2850, 2450, 3000, 5000, 3000],
            'MGR': [7839, 7839, 7839, 7566, None, 7566],
            'comm': [None, None, None, None, None, None],
            'deptno': [20, 30, 10, 20, 10, 20]})
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)

    # Multi row subquery
    def test03(self):
        sql = """select deptno from emp
                 where deptno in (select deptno from emp
                                  where job = 'MANAGER')"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame(
            {'deptno': [10, 30, 10, 20, 20, 20, 20, 30, 30, 30, 30, 20, 30,
                        10]})
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)

    def test04(self):
        sql = """select ename, sal from emp
                 where sal > (select min(sal) from emp
                                  where job = 'SALESMAN')"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame({
            'ename': ['KING', 'BLAKE', 'CLARK', 'JONES', 'SCOTT', 'FORD',
                      'ALLEN', 'TURNER', 'MILLER'],
            'sal': [5000, 2850, 2450, 2975, 3000, 3000, 1600, 1500, 1300]
        })
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)

    # inline view
    def test05(self):
        sql = """select e.ename, e.deptno, e.sal
                 from emp e, (select deptno, max(sal) as max_sal
                             from emp group by deptno) i
                 where e.deptno  = i.deptno and e.sal = i.max_sal"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame({
            'ename': ['BLAKE', 'SCOTT', 'KING', 'FORD'],
            'deptno': [30, 20, 10, 20],
            'sal': [2850, 3000, 5000, 3000]
        })
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)

    def test06(self):
        sql = """select ename, deptno, sal from emp 
                 where sal in (select max(sal) from emp group by deptno)"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame({
            'ename': ['BLAKE', 'SCOTT', 'KING', 'FORD'],
            'deptno': [30, 20, 10, 20],
            'sal': [2850, 3000, 5000, 3000]
        })
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)

    # Multi Column subquery
    def test07(self):
        sql = """select ename, deptno, sal from emp
                 where (deptno, sal) in (select deptno, max(sal)
                                         from emp group by deptno)"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame({
            'ename': ['BLAKE', 'FORD', 'SCOTT', 'KING'],
            'deptno': [30, 20, 20, 10],
            'sal': [2850, 3000, 3000, 5000]
        })
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)

    # nested not correlated
    def test08(self):
        sql = """Select * From dept
                 where deptno in (select deptno from emp
                                  where sal > (select sal from emp
                                                  where empno = 7788))"""
        res = self.brtcsql.execute(sql)
        ref = pd.DataFrame({'deptno': [10],
                            'dname': ['ACCOUNTING'],
                            'loc': ['NEW YORK']
                            })
        table_cmp(sql, res, ref, print_dfs=self.print_dfs,
                  check_row_order=self.check_row_order)


if __name__ == '__main__':
    unittest.main()