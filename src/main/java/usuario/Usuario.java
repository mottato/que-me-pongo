package usuario;

import clima.ServicioClimatico;
import guardarropas.RepositorioDeGuardarropas;
import prenda.Prenda;
import prenda.GeneradorDeSugerencias;
import propuesta.*;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  private final List<String> idsGuardarropas = new ArrayList<>();
  private final List<Propuesta> propuestas = new ArrayList<>();
  private final ServicioClimatico servicioClimatico;
  private final GeneradorDeSugerencias generadorDeSugerencias;
  private final RepositorioDeGuardarropas repositorioDeGuardarropas;

  private Usuario(ServicioClimatico servicioClimatico,
                  GeneradorDeSugerencias generadorDeSugerencias,
                  RepositorioDeGuardarropas repositorioDeGuardarropas) {
    this.servicioClimatico = servicioClimatico;
    this.generadorDeSugerencias = generadorDeSugerencias;
    this.repositorioDeGuardarropas = repositorioDeGuardarropas;
  }

  public Atuendo sugerirAtuendo() {
    double temperatura = servicioClimatico.getTemperatura();
    return generadorDeSugerencias.sugerirAtuendo(temperatura);
  }

  public void crearGuardarropas(List<Prenda> prendas, String descripcion) {
    String idNuevoGuardarropa = repositorioDeGuardarropas.crearGuardarropas(prendas, descripcion);
    idsGuardarropas.add(idNuevoGuardarropa);
  }

  public void agregarGuardarropasExistente(String idGuardarropa) {
    this.idsGuardarropas.add(idGuardarropa);
  }

  public void agregarPrendaAGuardarropas(Prenda prenda, String idGuardarropas){
    repositorioDeGuardarropas.agregarPrendaAGuardarropas(idGuardarropas, prenda);
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
    propuesta.ejecutarAccionPropuesta(repositorioDeGuardarropas);
  }

  public void rechazarPropuesta(Propuesta propuesta) {
    propuesta.rechazarPropuesta();
  }
}
