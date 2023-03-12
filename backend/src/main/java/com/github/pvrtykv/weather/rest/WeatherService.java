package com.github.pvrtykv.weather.rest;

import com.github.pvrtykv.weather.config.WeatherConfig;
import com.github.pvrtykv.weather.mapper.WeatherMapper;
import com.github.pvrtykv.weather.model.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private final WeatherConfig weatherConfig;
    private final WeatherClient weatherClient;

    public WeatherService(WeatherConfig weatherConfig, WeatherClient weatherClient) {
        this.weatherConfig = weatherConfig;
        this.weatherClient = weatherClient;
    }

    public Weather getCurrentWeather(String cityName) {
        return WeatherMapper.toModel(weatherClient.getCurrentWeather(cityName, weatherConfig.getApiKey()));
    }

}
