package Propuesta;

import Guardarropas.RepositorioDeGuardarropas;
import Prenda.Prenda;

public interface AccionPropuesta {
  void ejecutar(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas);
  void deshacer(Prenda prenda, String idGuardarropas, RepositorioDeGuardarropas repositorioDeGuardarropas);
}
