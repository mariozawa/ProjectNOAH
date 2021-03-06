package xyz.jcdc.projectnoah;

/**
 * Created by jcdc on 9/2/2016.
 */

public class Constants {
    public static final String FOUR_HOUR_FORCAST = "http://noah.dost.gov.ph/api/four_hour_forecast";

    public static final String LATEST_CONTOUR = "http://noah.dost.gov.ph/api/latest_contour";

    public static final String DOPPLER = "http://noah.dost.gov.ph/api/doppler";

    public static final String SATELLITE = "http://noah.dost.gov.ph/api/mtsat";

    public static final String WEATHER_OUTLOOK_RAIN_FORECAST = "http://noah.dost.gov.ph/weather/rain_forecast";

    public static final String WEATHER_STATIONS = "http://noah.dost.gov.ph/api/stations";

    public static final String WEATHER_STATIONS_MARKER = "http://noah.dost.gov.ph/static/img/map/";

    public static final String FLOOD_HAZARD = "http://noah.dost.gov.ph/flood/floodhazards";

    public static final String LAYER_WEATHER_CONTOUR = "weather_contour";
    public static final String ACTION_WEATHER_CONTOUR_1 = "1 Hour Rainfall Contour";
    public static final String ACTION_WEATHER_CONTOUR_3 = "3 Hour Rainfall Contour";
    public static final String ACTION_WEATHER_CONTOUR_6 = "6 Hour Rainfall Contour";
    public static final String ACTION_WEATHER_CONTOUR_12 = "12 Hour Rainfall Contour";
    public static final String ACTION_WEATHER_CONTOUR_24 = "24 Hour Rainfall Contour";
    public static final String ACTION_WEATHER_CONTOUR_TEMPERATURE = "Temperature Contour";
    public static final String ACTION_WEATHER_CONTOUR_PRESSURE = "Pressure Contour";
    public static final String ACTION_WEATHER_CONTOUR_HUMIDITY = "Humidity Contour";

    public static final String LAYER_WEATHER_DOPPLER = "weather_doppler";
    public static final String ACTION_WEATHER_DOPPLER_BAGUIO = "Baguio Station";
    public static final String ACTION_WEATHER_DOPPLER_SUBIC = "Subic Station";
    public static final String ACTION_WEATHER_DOPPLER_TAGAYTAY = "Tagaytay Station";
    public static final String ACTION_WEATHER_DOPPLER_CEBU = "Cebu Station";
    public static final String ACTION_WEATHER_DOPPLER_HINATAUAN = "Hinatuan Station";
    public static final String ACTION_WEATHER_DOPPLER_TAMPAKAN = "Tampakan Station";
    public static final String ACTION_WEATHER_DOPPLER_APARRI = "Aparri Station";
    public static final String ACTION_WEATHER_DOPPLER_VIRAC = "Virac Station";
    public static final String ACTION_WEATHER_DOPPLER_BALER = "Baler Station";

    public static final String LAYER_WEATHER_SATELLITE = "weather_satellite";
    public static final String ACTION_WEATHER_SATELLITE_HIMAWARI = "Satellite Image (Himawari)";
    public static final String ACTION_WEATHER_SATELLITE_GSMAP_1 = "Accumulated GSMAP (1hr)";
    public static final String ACTION_WEATHER_SATELLITE_GSMAP_3 = "Accumulated GSMAP (3hr)";
    public static final String ACTION_WEATHER_SATELLITE_GSMAP_6 = "Accumulated GSMAP (6hr)";
    public static final String ACTION_WEATHER_SATELLITE_GSMAP_12 = "Accumulated GSMAP (12hr)";

    public static final String LAYER_WEATHER_FORECAST = "weather_forecast";
    public static final String ACTION_WEATHER_FORECAST_4 = "4-Hour Rain Forecast";

    public static final String LAYER_SENSORS = "sensors";
    public static final String ACTION_SENSORS_WEATHER = "Automated Weather Stations";
    public static final String ACTION_SENSORS_RAIN_GAUGE = "Automated Rain Gauges";
    public static final String ACTION_SENSORS_STREAM_GAUGE = "Automated Stream Gauges";
    public static final String ACTION_SENSORS_RAIN_AND_STREAM_GAUGE = "Automated Rain and Stream Gauges";
    public static final String ACTION_SENSORS_TIDE_LEVELS = "Tide Level Stations";


}
