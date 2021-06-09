package propuesta;

import guardarropas.RepositorioDeGuardarropas;
import prenda.Prenda;

public class Propuesta {
  private final Prenda prendaPropuesta;
  private final AccionPropuesta accionPropuesta;
  private final String idGuardarropas;
  private EstadoPropuesta estado = EstadoPropuesta.PENDIENTE;

  public Propuesta(String idGuardarropas, Prenda prendaPropuesta, AccionPropuesta accionPropuesta) {
    this.idGuardarropas = idGuardarropas;
    this.prendaPropuesta = prendaPropuesta;
    this.accionPropuesta = accionPropuesta;
  }

  public EstadoPropuesta getEstado() {
    return estado;
  }

  public Prenda getPrendaPropuesta() {
    return prendaPropuesta;
  }

  public AccionPropuesta getAccionPropuesta() {
    return accionPropuesta;
  }

  public String getIdGuardarropas() {
    return idGuardarropas;
  }

  public void ejecutarAccionPropuesta(RepositorioDeGuardarropas repositorioDeGuardarropas){
    accionPropuesta.ejecutar(prendaPropuesta, idGuardarropas, repositorioDeGuardarropas);
  }

  public void deshacerPropuesta(RepositorioDeGuardarropas repositorioDeGuardarropas) {
    // Confío en el adentro, en que la acción propuesta si o si va a ser una propuesta aceptada
    accionPropuesta.deshacer(prendaPropuesta, idGuardarropas, repositorioDeGuardarropas);
    this.estado = EstadoPropuesta.PENDIENTE;
  }

  public void aceptarPropuesta() {
    this.estado = EstadoPropuesta.ACEPTADO;
  }

  public void rechazarPropuesta() {
    this.estado = EstadoPropuesta.RECHAZADO;
  }
}
