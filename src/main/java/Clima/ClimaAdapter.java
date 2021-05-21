package Clima;

import java.util.HashMap;

public class ClimaAdapter {
    private static String CIUDAD = "Buenos Aires, Argentina";
    private AccuWeatherAPI weatherAPI;
    private HashMap<String, Object> condicionesClimaticasCache;
    private int cantidadDeConsultas;

    public ClimaAdapter(AccuWeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
        this.condicionesClimaticasCache = getCondicionesClimaticas();
        this.cantidadDeConsultas = 0;
    }

    public double getTemperatura() {
        try {
            HashMap<String, Object> temperatura = (HashMap<String, Object>) this.getCondicionesClimaticas().get("Temperature");
            return (double) temperatura.get("Value");
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
        if(this.condicionesClimaticasCache == null) {
            this.condicionesClimaticasCache = consultarCondicionesClimaticas();
        }
        return this.condicionesClimaticasCache;
    }

    private HashMap<String, Object> consultarCondicionesClimaticas() {
        puedeHacerConsultaGratuita();
        try {
            cantidadDeConsultas++;
            return (HashMap<String, Object>) this.weatherAPI.getWeather(CIUDAD).get(0);
        } catch (Exception e){
            throw new RuntimeException("No se pudo obtener las condiciones climáticas.");
        }
    }

    private void puedeHacerConsultaGratuita() {
        if(cantidadDeConsultas == 10) {
            throw new RuntimeException("Se llego al limite de consultas gratuitas del dia");
        }
    }
}
