/**
 * Created by ji_sung.park on 2017-07-04.
 */
(function () {
    'use strict';

    var root = this;
    var Brightics = root.Brightics;

    function BigDataColumnGenerator(options) {
        Brightics.VA.Core.Utils.FnUnitGenerator.call(this, options);
    }

    BigDataColumnGenerator.prototype = Object.create(Brightics.VA.Core.Utils.FnUnitGenerator.prototype);
    BigDataColumnGenerator.prototype.constructor = BigDataColumnGenerator;

    BigDataColumnGenerator.prototype.inputParams = function () {
        var param = this.fnUnit.param;
        var chartOptions = this.options.chartOptions;
        this.aggregation = '';

        if (chartOptions.xAxis && chartOptions.xAxis[0] && chartOptions.xAxis[0].selected && chartOptions.xAxis[0].selected[0]) {
            param['xcolumn'] = [[this.options.chartOptions.xAxis[0].selected[0].name]];
        }

        if (chartOptions.yAxis && chartOptions.yAxis[0] && chartOptions.yAxis[0].selected && chartOptions.yAxis[0].selected[0]) {
            param['ycolumn'] = [[this.options.chartOptions.yAxis[0].selected[0].name]];
            this.aggregation = chartOptions.yAxis[0].selected[0].aggregation;
        }

        this.setAggregationParam();
        this.setColorByParam();
    };

    Brightics.VA.Core.Utils.FnUnitGenerator.column = BigDataColumnGenerator;

}).call(this);