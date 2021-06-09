package propuesta;

import prenda.Prenda;
import usuario.Usuario;

public class AccionAgregar implements AccionPropuesta {

  public AccionAgregar() {
  }

  public void ejecutar(Prenda prenda, String idGuardarropas, Usuario duenio) {
    duenio.agregarPrendaAGuardarropas(prenda, idGuardarropas);
  }

  @Override
  public void deshacer(Prenda prenda, String idGuardarropas, Usuario duenio) {
    duenio.quitarPrendaDeGuardarropas(prenda, idGuardarropas);
  }

}
