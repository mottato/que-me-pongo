package Clima;

import java.util.HashMap;

public class ClimaAccuWeather implements ServicioClimatico {
    private AccuWeatherAPI weatherAPI;

    public ClimaAccuWeather(AccuWeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }


    public double getTemperatura() {
        try {
            HashMap<String, Object> temperatura = (HashMap<String, Object>) this.getCondicionesClimaticas().get("Temperature");
            return convertirFahrenheitACelsius((double) temperatura.get("Value"));
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la temperatura.");
        }
    }

    public double getPrecipitaciones() {
        try {
            return (double) this.getCondicionesClimaticas().get("PrecipitationProbability");
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener las precipitaciones.");
        }
    }

    private HashMap<String, Object> getCondicionesClimaticas() {
        try {
            return (HashMap<String, Object>) this.weatherAPI.getWeather(CIUDAD).get(0);
        } catch (Exception e){
            throw new RuntimeException("No se pudo obtener las condiciones climáticas.");
        }
    }
}
