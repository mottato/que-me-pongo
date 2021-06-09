package propuesta;

import guardarropas.RepositorioDeGuardarropas;
import prenda.Prenda;

public interface AccionPropuesta {
  void ejecutar(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas);
  void deshacer(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas);
}
