package clima;

import java.util.List;
import java.util.Map;

public class Alerta {
  ServicioMeteorologico servicioMeteorologico;
  Map<String, Object> alertas;
  CondicionesClimaticas condicionClimatica;

  public CondicionesClimaticas getCondicionesClimaticas() {
    return condicionClimatica;
  }

  public List<Alerta> getAlertas() {
    return servicioMeteorologico.getAlertas();
  }
}
