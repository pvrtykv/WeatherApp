## WeatherApp

Simple app that retrieves weather for a given city. This application uses openweathermap API as data source. 


### How to run
In order to run application, you need to obtain API key - you can get it for free after signing up on [OpenWeatherMap website](https://openweathermap.org/).

In order to run using Docker:

Create `.env` file in repository root directory
```shell
API_KEY=key # API key from OpenWeather API
```
Then run following command:
```shell
docker-compose up --build
```

### Connecting to the service
Frontend runs on port `80`, server runs on port `8080`.
