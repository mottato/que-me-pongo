package Propuesta;

import Guardarropas.RepositorioDeGuardarropas;
import Prenda.Prenda;

public class AccionQuitar implements AccionPropuesta{

  public AccionQuitar() {
  }

  public void ejecutar(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas) {
    repositorioDeGuardarropas.quitarPrenda(prenda, idGuardarropas);
  }

  @Override
  public void deshacer(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas) {
    repositorioDeGuardarropas.agregarPrendaAGuardarropas(idGuardarropas, prenda);
  }
}
