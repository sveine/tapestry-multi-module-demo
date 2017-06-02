define(["leaflet-src", "jquery", "underscore"],
        /**
         * @param L
         * @param $
         * @param _
         * @return {IntelliJBugs}
         */
        function (L, $, _) {

            /** @constructor */
            function IntelliJBugs() {
            }

            /** @type {L.Map} */
            var map;

            /**
             * @public
             * @param {{
             *      zoom  :number,
             * }} options
             */
            IntelliJBugs.init = function (options) {
                var zoom;
                if (options != null) {
                    zoom = options.zoom;
                }



                var mapOptions = {
                    center: [51.505, -0.09],
                    zoom: 13,
                    worldCopyJump: true
                };

                if (zoom != null) {
                    //-------------------------------------------------
                    // Unresolved function or method extend()
                    //-------------------------------------------------
                    mapOptions = _.extend(mapOptions, {zoom: zoom} );
                }

                //-------------------------------------------------
                // Unresolved function or method extend()
                //-------------------------------------------------
                if (L.Browser.touch) $.extend(mapOptions, {zoomSnap: 0});

                /**
                 * @type L.Map
                 */
                map = L.map('map', mapOptions);
                new L.TileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'}).addTo(map);


                //-------------------------------------------------
                // Unresolved function or method on()
                //-------------------------------------------------
                map.on('zoomend', IntelliJBugs.onZoomend);
                IntelliJBugs.onZoomend();

            }/*init*/;

            IntelliJBugs.onZoomend = function () {
                //-------------------------------------------------
                // Unresolved function or method getZoom()
                //-------------------------------------------------
                var zoom = map.getZoom();
                $("#zoom").html(zoom);
            };

            return IntelliJBugs;
        }
);