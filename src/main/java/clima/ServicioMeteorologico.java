package clima;

import java.util.ArrayList;
import java.util.List;

public interface ServicioMeteorologico {
    String CIUDAD = "Buenos Aires, Argentina";
    List<Alerta> alertas = new ArrayList<>();

    default List<Alerta> getAlertas(){
        return alertas;
    }
    double getTemperatura();
    double getPrecipitaciones();

    default double convertirFahrenheitACelsius(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }
}
