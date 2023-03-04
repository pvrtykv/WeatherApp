## WeatherApp

Simple API that retrieves weather for a given city. This application uses openweathermap API as data source.


### How to run
In order to run application, you need to obtain API key - you can get it for free after signing up on [OpenWeatherMap website](https://openweathermap.org/).

In order to run using Docker:

Create `.env` file in repository root directory
```shell
API_KEY=key # API key from OpenWeather API
```
Then run following commands:
```shell
docker-compose build
docker-compose up
```

### Connecting to the service
Server runs on port `8080`.

### Endpoints
- Weather query
``/current-weather/{cityName}``
  - Description: Get current weather for a given city.
  - Params:
    - cityName - name of the city we want to get weather from
  - Example of API response:
  ```json
    {
    "temperature": "2.08°C",
    "feelsLike": "-2.39°C",
    "pressure": "1011.0hPa",
    "windSpeed": "5.14m/s",
    "humidity": "77.0%",
    "clouds": "Overcast"
    }
    ```
- Swagger UI
``/swagger-ui.html``  

