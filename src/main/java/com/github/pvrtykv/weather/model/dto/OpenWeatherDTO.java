package com.github.pvrtykv.weather.model.dto;

import com.github.pvrtykv.weather.model.Weather;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OpenWeatherDTO {
    MainDTO main;
    WindDTO wind;
    CloudsDTO clouds;



}
