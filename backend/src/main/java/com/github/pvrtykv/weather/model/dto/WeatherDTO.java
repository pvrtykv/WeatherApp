package com.github.pvrtykv.weather.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherDTO {
    String description;
    String icon;
}
