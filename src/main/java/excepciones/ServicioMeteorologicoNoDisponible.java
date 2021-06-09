package excepciones;

public class ServicioMeteorologicoNoDisponible extends RuntimeException {
  public ServicioMeteorologicoNoDisponible(String msg) {
    super(msg);
  }
}
