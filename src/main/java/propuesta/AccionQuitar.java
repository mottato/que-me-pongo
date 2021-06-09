package propuesta;

import prenda.Prenda;
import usuario.Usuario;

public class AccionQuitar implements AccionPropuesta{

  public AccionQuitar() {
  }

  public void ejecutar(Prenda prenda, String idGuardarropas, Usuario duenio) {
    duenio.quitarPrendaDeGuardarropas(prenda, idGuardarropas);
  }

  @Override
  public void deshacer(Prenda prenda, String idGuardarropas, Usuario duenio) {
    duenio.agregarPrendaAGuardarropas(prenda, idGuardarropas);
  }
}
