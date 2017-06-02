define(["leaflet-src", "jquery"],
        /**
         * @param L
         * @param $
         * @return {Leaflet}
         */
        function (L, $) {

            /** @constructor */
            function Leaflet() {
            }

            /** @type {L.Map|L.Mixin.Events} */
            var map;

            /**
             * @public
             */
            Leaflet.init = function () {
                map = L.map('map', {
                    center: [51.505, -0.09],
                    zoom: 13
                });
                L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'}).addTo(map);

            }/*init*/;

            return Leaflet;
        }
);