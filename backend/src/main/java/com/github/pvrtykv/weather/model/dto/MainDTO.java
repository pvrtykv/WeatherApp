package com.github.pvrtykv.weather.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MainDTO {
    double temp;
    double feels_like;

    double pressure;
    double humidity;
}
