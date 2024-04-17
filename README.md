<h1>Weather App </h1>
<h2>Introduction</h2>
<p>
    The Weather App is a Java-based application that provides users with real-time weather information for a specified location. It fetches weather data from an external API and displays it in a graphical user interface (GUI). Users can enter a location, and the app retrieves and 
    presents weather details, including temperature, weather condition, humidity, and wind speed. This documentation outlines the project's architecture, technologies used, and the functionality of each class within the application.
</p>
<p align="center">
    <img src="" align="center">
</p>

<h2>Technologies Used</h2>
<p>
    The Weather App utilizes the following technologies and libraries:
</p>
<ul>
  <li>Java 17.</li>
  <li><a href="https://code.google.com/archive/p/json-simple/downloads">JSON Simple</a>: Used to parse and read through JSON data.</li>
  <li><a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/net/HttpURLConnection.html">HTTPURLConnection</a>: Java's built-in library for making HTTP requests to fetch data from external APIs.</li>
  <li><a href="https://open-meteo.com/en/docs#latitude=33.767&longitude=-118.1892">Weather Forecast API</a>: Seamless integration of high-resolution weather models with up 16 days forecast.</li>
    <li><a href="https://open-meteo.com/en/docs/geocoding-api">Geocoding API</a>: Search locations globally in any language.</li>
</ul>
<h2>Class Description</h2>

<h3>3.1. AppLauncher</h3>
<p>
    <strong>Description:</strong> The AppLauncher class serves as the entry point for the Weather App. It initializes the GUI and displays the main application window.
</p>

<h3>3.2. WeatherApp</h3>
<p>
    <strong>Description:</strong> The WeatherApp class represents the graphical user interface (GUI) of the Weather App. It is responsible for displaying weather information for a specified location.
</p>

<h3>3.3. WeatherAppBack</h3>
<p>
    <strong>Description:</strong> The WeatherAppBack class contains the backend logic for fetching weather data from an external API. It retrieves geographic coordinates for a location, fetches weather data for that location, and provides methods to convert weather codes.
</p>

