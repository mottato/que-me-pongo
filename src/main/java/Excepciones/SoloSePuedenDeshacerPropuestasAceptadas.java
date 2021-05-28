package Excepciones;

public class SoloSePuedenDeshacerPropuestasAceptadas extends RuntimeException {
  public SoloSePuedenDeshacerPropuestasAceptadas() {
    super("Solo se puede deshacer propuestas que fueron aceptadas. ");
  }
}
