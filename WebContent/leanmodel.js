(function(a) {
	a.fn.extend({
		leanModel : function(b) {
			var c = {
				top : 1,
				overlay : 0.3,
				modelRef : null,
				trigger : null,
				closeButton : null,
				closeTrigger : null
			};
			if (a("#lean_overlay").size() == 0) {
				a("body").append(a("<div id='lean_overlay'></div>"));
			}
			b = a.extend(c, b);
			return this.each(function() {
				var d = a(this);
				var e = b;
				d.click(function(k) {
					var j = a(this);
					var i = e.modelRef ? e.modelRef : j.attr("model-href");
					var f = a(i);
					var l = a("#lean_overlay");
					a(e.closeButton).click(function() {
						l.fadeOut(200);
						f.css({
							display : "none"
						});
						if (e.closeTrigger != null) {
							j.trigger(e.closeTrigger);
						}
						return false;
					});
					var g = f.outerHeight();
					var h = f.outerWidth();
					l.css({
						display : "block",
						opacity : 0
					});
					l.fadeTo(200, e.overlay);
					f.css({
						display : "block",
						"margin-left" : -(h / 2) + "px",
						"margin-top" : (e.top - (g / 2)) + "px"
					});
					if (e.trigger != null) {
						j.trigger(e.trigger);
					}
					k.preventDefault();
				});
			});
		}
	});
})(jQuery);