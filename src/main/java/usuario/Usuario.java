package usuario;

import clima.Alerta;
import clima.ServicioMeteorologico;
import excepciones.GuardarropasNoExistente;
import guardarropas.Guardarropas;
import prenda.Prenda;
import propuesta.*;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  private final List<Guardarropas> guardarropas = new ArrayList<>();
  private final List<Propuesta> propuestas = new ArrayList<>();
  private Sugerencia sugerencia;

  private Usuario() {

  }

  public void crearGuardarropas(List<Prenda> prendas, String descripcion) {
    Guardarropas nuevoGuardarropas = new Guardarropas(prendas, descripcion);
    guardarropas.add(nuevoGuardarropas);
  }

  public void agregarGuardarropasExistente(Guardarropas guadarropasExistente) {
    this.guardarropas.add(guadarropasExistente);
  }

  public void agregarPrendaAGuardarropas(Prenda prenda, String idGuardarropasDeseado) {
    getGuardarropas(idGuardarropasDeseado).agregarPrenda(prenda);
  }

  public List<Propuesta> getPropuestas() {
    return propuestas;
  }

  public void recibirPropuesta(Prenda prenda, AccionPropuesta accion, String idGuardarropas) {
    Propuesta nuevaPropuesta = new Propuesta(idGuardarropas, prenda, accion);
    propuestas.add(nuevaPropuesta);
  }

  public void aceptarPropuesta(Propuesta propuesta) {
    propuesta.aceptarPropuesta();
    propuesta.ejecutarAccionPropuesta(this);
  }

  public void rechazarPropuesta(Propuesta propuesta) {
    propuesta.rechazarPropuesta();
  }

  public void quitarPrendaDeGuardarropas(Prenda prenda, String idGuardarropas) {
    getGuardarropas(idGuardarropas).quitarPrenda(prenda);
  }

  private Guardarropas getGuardarropas(String idGuardarropas) {
    return guardarropas.stream()
        .filter(guardarropa -> guardarropa.getIdGuardarropas().equals(idGuardarropas))
        .findFirst().orElseThrow(GuardarropasNoExistente::new);
  }

  public Atuendo obtenerSugerencia() {
    return sugerencia.generarSugerencia();
  }

  public void actualizarSugerenciaSegunClima(){
    Alerta alertas = new Alerta();
    alertas.getAlertas();
    sugerencia.generarSugerencia();
  }
  public void llevarParaguas(){}
  public void viajarEnAuto(){}
}
