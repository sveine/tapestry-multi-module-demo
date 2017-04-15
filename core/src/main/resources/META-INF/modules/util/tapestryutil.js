define(["jquery", "t5/core/zone", "t5/core/events", "t5/core/ajax"], function ($, Zone, Events, Ajax) {

    /** @constructor */
    function TapestryUtil() {
    }

    /** @type {string} */
    TapestryUtil.ENCODED_NULL = "$N"; // Defined in URLEncoderImpl.java
    TapestryUtil.ENCODED_SLASH = "$002f"; // Defined in URLEncoderImpl.java


    /**
     * @param {*} json Tapestry JSON response object
     * @return {?string} Content with HTML for Zone
     */
    TapestryUtil.getAjaxResponseContent = function (json) {
        if (json == null) return null;
        if (json.content != null) return json.content;
        return json["_tapestry"].content[0][1];
    };

    /**
     * @param {string} url
     * @param {Function} callback
     */
    TapestryUtil.getDeferredZoneUpdateContent = function (url, callback) {
        var tempId = "TmpId_" + new Date().getTime();
        $('<div data-container-type="zone" hidden="hidden"/>')
                .attr("id", tempId)
                .appendTo(document.body)
                .on(Events.zone.didUpdate, function () {
                    var html = $(this).html();
                    $(this).remove();
                    if (typeof(callback) == typeof(Function))
                        callback.call(null, html);
                });
        Zone.deferredZoneUpdate(tempId, url);
    };

    /**
     * @param {string} url
     * @param {Object=} options
     * @param {{}|String|Array} [options.data]
     * @param {String} [options.method=POST]
     * @param {TapestryUtil.ResponseFunction} [options.success]
     * @param {TapestryUtil.ResponseFunction} [options.failure]
     * @param {Function} [options.complete]
     * @returns TapestryUtil.RequestWrapper
     */
    TapestryUtil.ajax = function (url, options) {
        var newOptions = _.extend({}, options);
        return Ajax(url, newOptions);
    };

    /**
     * @param {jQuery} $element
     * @param {Function} handler
     */
    TapestryUtil.onEventsZoneDidUpdate = function ($element, handler) {
        $element.on(Events.zone.didUpdate, handler);
    };

    /**
     @typedef {Function} TapestryUtil.ResponseFunction
     @param {TapestryUtil.ResponseWrapper} response
     */

    /**
     @typedef {Object} TapestryUtil.ResponseWrapper
     @property {jqxhr}      jqxhr,
     @property {String}     status
     @property {String}     statusText
     @property {{}}         json
     @property {String}     text
     */

    /**
     @typedef {Object} TapestryUtil.RequestWrapper
     @property {jqxhr} jqxhr,
     */




    return TapestryUtil;
});
