package com.github.pvrtykv.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Weather {
    private String temperature;
    private String feelsLike;
    private String pressure;
    private String windSpeed;
    private String humidity;
    private String clouds;
    private String description;
    private String iconId;
}
