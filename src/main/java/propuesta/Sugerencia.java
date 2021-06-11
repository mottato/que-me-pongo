package propuesta;

import usuario.Atuendo;

import java.util.List;
import java.util.Random;

public class Sugerencia {
  static List<Atuendo> atuendosSugeridos;

  public static  Atuendo generarSugerencia(){   // Se me ocurrio que puede tomar una prenda de manera alaeatoria
    Random atuendoRandom = new Random();
    return atuendosSugeridos.get(atuendoRandom.nextInt(atuendosSugeridos.size()));
  }
}
