package guardarropas;

import excepciones.GuardarropasNoExistente;
import prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeGuardarropas {
  private final List<Guardarropas> guardarropas = new ArrayList<>();

  private RepositorioDeGuardarropas() {
  }

  public void agregarPrendaAGuardarropas(String idGuardarropas, Prenda prenda) {
    obtenerGuardarropas(idGuardarropas).agregarPrenda(prenda);
  }

  public List<Guardarropas> getGuardarropas() {
    return guardarropas;
  }

  public String crearGuardarropas(List<Prenda> prendas, String descripcion) {
    Guardarropas nuevoGuardarropas = new Guardarropas(prendas, descripcion);
    guardarropas.add(nuevoGuardarropas);
    return nuevoGuardarropas.getIdGuardarropas();
  }

  public Guardarropas obtenerGuardarropas(String idGuardarropas) {
    return guardarropas.stream()
        .filter(guardarropa -> guardarropa.getIdGuardarropas().equals(idGuardarropas))
        .findFirst().orElseThrow(GuardarropasNoExistente::new);
  }

  public void quitarPrenda(Prenda prenda, String idGuardarropas) {
    obtenerGuardarropas(idGuardarropas).quitarPrenda(prenda);
  }
}
