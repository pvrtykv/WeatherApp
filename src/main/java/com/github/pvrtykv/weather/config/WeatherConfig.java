package com.github.pvrtykv.weather.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class WeatherConfig {
    private final String apiKey;

    public WeatherConfig(Environment environment) {
        apiKey = environment.getRequiredProperty("API_KEY");
    }

    public String getApiKey() {
        return apiKey;
    }
}
