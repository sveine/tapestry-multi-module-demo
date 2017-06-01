/**
 @typedef {{}} L
 */
define(["jquery"],
        /**
         * @param $
         * @return {Leaflet}
         */
        function ($) {

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
                new L.TileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'}).addTo(map);

            }/*init*/;

            return Leaflet;
        }
);