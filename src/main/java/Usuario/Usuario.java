package Usuario;

import Clima.ServicioClimatico;
import Guardarropas.RepositorioDeGuardarropas;
import Prenda.Prenda;
import Prenda.GeneradorDeSugerencias;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  private List<String> idsGuardarropas = new ArrayList<>();
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
}
