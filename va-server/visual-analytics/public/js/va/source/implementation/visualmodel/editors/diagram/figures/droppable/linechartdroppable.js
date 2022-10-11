/**
 * Created by SDS on 2017-05-19.
 */
(function () {
    'use strict';

    var root = this;
    var Brightics = root.Brightics;

    function LineChartDroppable(parentId, options) {
        Brightics.Chart.Adonis.Component.ChartOption['line'].call(this, parentId, options);
    }

    LineChartDroppable.prototype = Object.create(Brightics.Chart.Adonis.Component.ChartOption['line'].prototype);
    LineChartDroppable.prototype.constructor = LineChartDroppable;

    LineChartDroppable.prototype._createContents = function () {
        this.options.contentsFactory.createContents(this.options.setting.columnSelector);
    };

    Brightics.VA.Implementation.Visual.Editors.Diagram.Figures.Droppable['line'] = LineChartDroppable;

}).call(this);