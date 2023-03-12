package com.github.pvrtykv.weather.rest;

import com.github.pvrtykv.weather.model.Weather;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class WeatherController {
    WeatherService weatherService;

    @Operation(summary = "Get current weather for a given city")
    @ApiResponse(responseCode = "200", description = "Operation successful")
    @ApiResponse(responseCode = "404", description = "City not found")
    @CrossOrigin
    @GetMapping("/current-weather/{cityName}")
    public Weather getWeather(@PathVariable("cityName") String cityName) {
        return weatherService.getCurrentWeather(cityName);
    }
}
