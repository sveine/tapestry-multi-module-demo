/**
 *  @see https://github.com/alexei/sprintf.js
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



            /**
             * @public
             * @param {{
             *      mapBounds                   :Leaflet.MapBounds,
             *      mapCenterZoom               :Leaflet.MapCenterZoom,
             *      filterHistoricPositions     :?Geo.Filter,
             *      filterSkiTracks             :?Geo.Filter,
             *      filterOldSkiTracks          :?Geo.Filter,
             *      filterVisibility            :?Geo.Filter,
             *      mapLocationMethod           :string
             *      mapLayers                   :?Layer.MapLayerOptions
             * }} options
             */
            Leaflet.init = function (options) {
                var map = L.map('map',{
                    center: [51.505, -0.09],
                    zoom: 13
                });
                L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'}).addTo(map);

            }/*init*/;
            /*
             INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN
             INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN INIT FIN
             */

            return Leaflet;
        }
);