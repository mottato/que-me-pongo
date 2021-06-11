package clima;

import java.util.List;
import java.util.Map;

public class Alerta {
  ServicioMeteorologico servicioMeteorologico;
  Map<String, Object> alertas;

  public List<Alerta> getAlertas() {
    return servicioMeteorologico.getAlertas();
  }
}
