package propuesta;

import prenda.Prenda;
import usuario.Usuario;

public interface AccionPropuesta {
  void ejecutar(Prenda prenda, String idGuardarropas, Usuario duenio);
  void deshacer(Prenda prenda, String idGuardarropas, Usuario duenio);
}
