package com.github.pvrtykv.weather;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@OpenAPIDefinition(
		info = @Info(
				title = "WeatherApp",
				version = "0.1.0",
				description = "Weather forecast API"
		)
)
@SpringBootApplication
@EnableFeignClients
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}
