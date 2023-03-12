package com.github.pvrtykv.weather.model.dto;

import com.github.pvrtykv.weather.model.Weather;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OpenWeatherDTO {
    MainDTO main;
    List<WeatherDTO> weather;
    WindDTO wind;
    CloudsDTO clouds;
}
