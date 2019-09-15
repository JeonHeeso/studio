"""
    Copyright 2019 Samsung SDS

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""


from brightics.function.regression.ada_boost_regression import ada_boost_regression_train
from brightics.function.regression.ada_boost_regression import ada_boost_regression_predict
from brightics.common.datasets import load_iris
import unittest
import pandas as pd
import numpy as np
import HtmlTestRunner
import os


class ADABoostRegression(unittest.TestCase):
    
    def setUp(self):
        print("*** ADA Boost Regression UnitTest Start ***")
        self.testdata = load_iris()

    def tearDown(self):
        print("*** ADA Boost Regression UnitTest End ***")
    
    def test(self):
        ada_train = ada_boost_regression_train(self.testdata, feature_cols=['sepal_length', 'sepal_width', 'petal_length',], label_col='petal_width', random_state=12345)
        ada_model = ada_train['model']['regressor']
        estimator_weights = ada_model.estimator_weights_ if hasattr(ada_model, 'estimator_weights_') else None
        estimator_errors = ada_model.estimator_errors_ if hasattr(ada_model, 'estimator_errors_') else None
        feature_importances = ada_model.feature_importances_ if hasattr(ada_model, 'feature_importances_') else None
        
        np.testing.assert_array_equal([round(x, 15) for x in estimator_weights], [1.413875270282188, 0.842690804421279, 0.745744569599211, 0.849855966774747, 0.873567992253140, 0.412870149785776, 0.735336038549665, 0.948762342244301, 0.119925737139696, 1.084352707003922, 0.215508369140552, 1.261341652523880, 0.693756215973489, 0.815705197279502, 0.107744343744492, 0.892721151562112, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000, 0.000000000000000])
        np.testing.assert_array_equal([round(x, 15) for x in estimator_errors], [0.195623543954738, 0.300968372309124, 0.321749243945297, 0.299463072654870, 0.294512419786350, 0.398224113163979, 0.324024864473794, 0.279133793052534, 0.470054447315167, 0.252683191393177, 0.446330465454831, 0.220743020672426, 0.333198005871043, 0.306676087054173, 0.473089941916390, 0.290548596637435, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000, 1.000000000000000])
        np.testing.assert_array_equal([round(x, 15) for x in feature_importances], [0.060563052789016, 0.057352925738117, 0.882084021472867])
        
        predict = ada_boost_regression_predict(self.testdata, ada_train['model'])
        species = predict['out_table']['species']
        prediction = predict['out_table']['prediction']
        np.testing.assert_array_equal(species, ['setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','setosa','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','versicolor','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica','virginica'])
        np.testing.assert_array_equal([round(x, 15) for x in prediction], [0.271428571428571 ,0.194444444444444 ,0.205555555555556 ,0.194444444444444 ,0.271428571428571 ,0.375000000000000 ,0.233333333333333 ,0.247619047619048 ,0.194444444444444 ,0.194444444444444 ,0.275000000000000 ,0.250000000000000 ,0.194444444444444 ,0.194444444444444 ,0.300000000000000 ,0.275000000000000 ,0.275000000000000 ,0.271428571428571 ,0.400000000000000 ,0.271428571428571 ,0.357142857142857 ,0.271428571428571 ,0.271428571428571 ,0.316666666666667 ,0.250000000000000 ,0.271428571428571 ,0.271428571428571 ,0.271428571428571 ,0.247619047619048 ,0.230000000000000 ,0.230000000000000 ,0.247619047619048 ,0.257894736842105 ,0.270000000000000 ,0.194444444444444 ,0.233333333333333 ,0.300000000000000 ,0.194444444444444 ,0.194444444444444 ,0.247619047619048 ,0.271428571428571 ,0.205555555555556 ,0.205555555555556 ,0.366666666666667 ,0.366666666666667 ,0.194444444444444 ,0.316666666666667 ,0.205555555555556 ,0.275000000000000 ,0.233333333333333 ,1.494444444444444 ,1.494444444444444 ,1.933999999999999 ,1.205882352941176 ,1.460000000000000 ,1.460000000000000 ,1.494444444444444 ,1.100000000000000 ,1.494444444444444 ,1.205263157894737 ,1.100000000000000 ,1.350000000000000 ,1.205882352941176 ,1.494444444444444 ,1.242105263157894 ,1.421428571428571 ,1.494444444444444 ,1.205882352941176 ,1.460000000000000 ,1.205263157894737 ,1.620000000000000 ,1.242105263157894 ,1.626315789473684 ,1.460000000000000 ,1.357142857142857 ,1.421428571428571 ,1.823333333333333 ,1.933999999999999 ,1.494444444444444 ,1.093333333333333 ,1.160000000000000 ,1.160000000000000 ,1.205263157894737 ,1.823333333333333 ,1.494444444444444 ,1.494444444444444 ,1.494444444444444 ,1.251851851851852 ,1.280000000000000 ,1.205882352941176 ,1.251851851851852 ,1.494444444444444 ,1.205882352941176 ,1.100000000000000 ,1.242105263157894 ,1.350000000000000 ,1.280000000000000 ,1.357142857142857 ,1.100000000000000 ,1.242105263157894 ,2.197916666666667 ,1.907843137254902 ,1.998387096774192 ,1.933999999999999 ,1.998387096774192 ,1.998387096774192 ,1.494444444444444 ,1.998387096774192 ,1.933999999999999 ,2.197916666666667 ,1.998387096774192 ,1.907843137254902 ,1.998387096774192 ,1.907843137254902 ,1.985882352941177 ,1.998701298701298 ,1.998387096774192 ,2.197916666666667 ,1.985882352941177 ,1.823333333333333 ,2.012903225806451 ,1.823333333333333 ,1.998387096774192 ,1.626315789473684 ,2.197916666666667 ,2.012903225806451 ,1.592000000000000 ,1.823333333333333 ,1.985882352941177 ,1.998387096774192 ,1.998387096774192 ,2.197916666666667 ,1.985882352941177 ,1.875342465753425 ,1.825000000000001 ,1.998387096774192 ,2.127500000000000 ,1.998701298701298 ,1.620000000000000 ,1.998701298701298 ,1.998701298701298 ,1.998387096774192 ,1.907843137254902 ,2.012903225806451 ,2.197916666666667 ,1.985882352941177 ,1.823333333333333 ,1.985882352941177 ,2.127500000000000 ,1.933999999999999])


if __name__ == '__main__':
    filepath = os.path.dirname(os.path.abspath(__file__))
    reportFoler = filepath + "/../../../../../../../reports"
    unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(combine_reports=True, output=reportFoler))
