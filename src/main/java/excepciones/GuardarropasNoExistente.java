package excepciones;

public class GuardarropasNoExistente extends RuntimeException {
  public GuardarropasNoExistente(){
    super("El guardarropas seleccionado no existe");
  }

}
