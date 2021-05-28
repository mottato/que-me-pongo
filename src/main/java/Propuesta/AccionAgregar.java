package Propuesta;

import Guardarropas.RepositorioDeGuardarropas;
import Prenda.Prenda;

public class AccionAgregar implements AccionPropuesta {

  public AccionAgregar() {
  }

  public void ejecutar(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas) {
    repositorioDeGuardarropas.agregarPrendaAGuardarropas(idGuardarropas, prenda);
  }

  @Override
  public void deshacer(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas) {
    repositorioDeGuardarropas.quitarPrenda(prenda, idGuardarropas);
  }

}
