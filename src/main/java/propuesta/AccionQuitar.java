package propuesta;

import guardarropas.RepositorioDeGuardarropas;
import prenda.Prenda;

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
