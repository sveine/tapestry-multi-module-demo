define(["jquery", "util/tapestryutil"],
        /**
         * @param $
         * @param TapestryUtil
         * @return {PublishEventDemo}
         */
        function ($, TapestryUtil) {

            /** @constructor */
            function PublishEventDemo() {
            }

            PublishEventDemo.init = function (callbackEvent, key) {
                TapestryUtil.ajaxEvent(callbackEvent, {
                    data: {key: key},
                    success: (function (response) {
                        var origin = response.json["origin"];
                        $("#resultPane").html(origin);
                        console.log('AjaxEventDemo:GetData: ' + origin);
                    })
                });
            };
            return PublishEventDemo;
        }
);



