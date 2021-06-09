package guardarropas;

import prenda.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Guardarropas {
  private final String idGuardarropas;
  private final List<Prenda> prendas;
  private String descripcion;

  public Guardarropas(List<Prenda> prendas, String descripcion) {
    this.idGuardarropas = UUID.randomUUID().toString();
    this.prendas = prendas == null ? new ArrayList<>() : prendas;
    this.descripcion = descripcion;
  }

  public void agregarPrenda(Prenda prenda){
    this.prendas.add(prenda);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public String getIdGuardarropas() {
    return idGuardarropas;
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }
}
