define(["jquery", "util/tapestryutil"],
        /**
         * @param $
         * @param TapestryUtil
         */
        function ($, TapestryUtil) {

            /** @constructor */
            function AjaxDemo() {
            }

            AjaxDemo.init = function (key) {
                TapestryUtil.ajax("/AjaxDemo:GetData", {
                    data: {key: key},
                    success: (function (response) {
                        var result = response.json["result"];
                        $("#resultPane").html(result);
                            console.log('AjaxDemo:GetData: ' +result );
                    })
                });


            };
            return AjaxDemo;
        }
);
