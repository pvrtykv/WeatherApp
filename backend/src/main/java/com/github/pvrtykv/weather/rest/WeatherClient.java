package com.github.pvrtykv.weather.rest;

import com.github.pvrtykv.weather.model.dto.OpenWeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(
        name = "weatherClient",
        url = "https://api.openweathermap.org/data/2.5"
        )

public interface WeatherClient {
    @GetMapping("/weather?q={city_name}&appid={API_key}&units=metric")
    OpenWeatherDTO getCurrentWeather(@PathVariable("city_name") String cityName, @PathVariable("API_key") String apiKey);


    }
