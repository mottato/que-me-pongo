package prenda;

import clima.ServicioMeteorologico;
import usuario.Atuendo;

public class GeneradorDeSugerencias {
  private final ServicioMeteorologico servicioMeteorologico;

  private GeneradorDeSugerencias(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Atuendo obtenerSugerenciaDeAtuendo() {
    double temperatura = servicioMeteorologico.getTemperatura();
    return null;
  }
}
