const weather = document.getElementById('weather');
const form = document.getElementById('form');
const search = document.getElementById('search');
const msg = document.getElementById('msg');

form.addEventListener("submit", e => {
  e.preventDefault();
  const city = search.value;
  const url = `/api/current-weather/${city}`;

  fetch(url)
    .then(response => response.json())
    .then(data => {
        const { temperature, feelsLike, pressure, windSpeed, humidity, clouds, description, iconId} = data;
    addWeatherData(data);
    })
    .catch(() => {
        msg.textContent = "Wrong city name! 😒";
        weather.innerHTML = ``;
    });
    msg.textContent = "";
});

function addWeatherData(data) {
    const temp = data.temperature;
    const feelsLike = data.feelsLike;
    const pressure = data.pressure;
    const windSpeed = data.windSpeed;
    const humidity = data.humidity;
    const clouds = data.clouds;
    const iconId = data.iconId; 

    weather.innerHTML = `
    <div class="weather-container">
        <div class="image">
            <img src="img/weather_codes/${iconId}.png">
        </div>
        <div class="weather-details">
            <h2>${temp}</h2>
            feels like: ${feelsLike} <br> 
            pressure: ${pressure} <br> 
            wind speed: ${windSpeed} <br> 
            humidity: ${humidity} <br> 
            clouds: ${clouds} <br> 
        </div>
    </div>
    `;
}