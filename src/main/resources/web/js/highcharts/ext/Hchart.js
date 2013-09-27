zk.$package('cwf.highcharts');
/**
 * Wrapper for HighCharts
 */
highcharts.ext.Hchart = zk.$extends(zul.wgt.Div, {

	_chart : null,

	_resizing : false,

	_init : function(options) {
		if (options)
			Highcharts.setOptions(options);
	},

	_clear : function() {
		this._run();
	},

	_run : function(options) {
		this._resizing = true;
		this._reset();

		if (options)
			this._chart = new Highcharts.Chart(options);

		this._resizing = false;
	},

	_redraw : function() {
		if (this._chart)
			this._chart.redraw();
	},

	_reset : function() {
		if (this._chart) {
			this._chart.destroy();
			this._chart = null;
		}
	},
	
	_title : function(options) {
		if (this._chart) {
			this._chart.setTitle(options.title, options.subtitle);
		}
	},

	_print : function(func) {
		if (this._chart)
			if (func)
				func.call(this._chart);
			else
				this._chart.print();
	},

	_export : function(func) {
		if (this._chart)
			if (func)
				func.call(this._chart);
			else
				this._chart.exportChart();
	},

	onSize : function() {
		if (!this._resizing && this._chart) {
			var c = jq(this);
			this._chart.setSize(c.width(), c.height());
		}
	},
	
	bind_: function () {
		this.$supers(highcharts.ext.Hchart, 'bind_', arguments);
		zWatch.listen({onSize: this});
	},
	
	unbind_ : function() {
		zWatch.unlisten({onSize: this});
		this._reset();
		this.$supers(highcharts.ext.Hchart, 'unbind_', arguments);
	}

});
