package com.github.pvrtykv.weather.mapper;

import com.github.pvrtykv.weather.model.Weather;
import com.github.pvrtykv.weather.model.dto.CloudsDTO;
import com.github.pvrtykv.weather.model.dto.OpenWeatherDTO;

public class WeatherMapper {
    private static final String CELSIUS = "°C";
    private static final String HECTOPASCAL = "hPa";
    private static final String PERCENT = "%";
    private static final String METER_PER_SECOND = "m/s";
    public static Weather toModel(OpenWeatherDTO openWeatherDTO) {
        return new Weather(
                mapTemperature(openWeatherDTO.getMain().getTemp()),
                mapTemperature(openWeatherDTO.getMain().getFeels_like()),
                mapPressure(openWeatherDTO.getMain().getPressure()),
                mapWindSpeed(openWeatherDTO.getWind().getSpeed()),
                mapHumidity(openWeatherDTO.getMain().getHumidity()),
                mapClouds(openWeatherDTO.getClouds().getAll()),
                openWeatherDTO.getWeather().get(0).getDescription(),
                openWeatherDTO.getWeather().get(0).getIcon());
    }

    private static String mapTemperature(double temperature) {
        return temperature + CELSIUS;
    }

    private static String mapPressure(double pressure) {
        return pressure + HECTOPASCAL;
    }

    private static String mapWindSpeed(double windSpeed) {
        return windSpeed + METER_PER_SECOND;
    }

    private static String mapHumidity(double humidity) {
        return humidity + PERCENT;
    }

    private static String mapClouds(int cloudsPercentage) {
        if (cloudsPercentage <= 10) {
            return "Sky clear";
        } else if (cloudsPercentage <= 40) {
            return  "Scattered clouds";
        } else if (cloudsPercentage <= 70) {
           return "Broken clouds";
        }
        return "Overcast";
    }
}
