package propuesta;

import usuario.Atuendo;

import java.util.List;
import java.util.Random;

public class Sugerencia {
   private List<Atuendo> atuendosSugeridos;

  public Atuendo generarSugerencia(){   // Se me ocurrio que puede tomar una prenda de manera alaeatoria
    Random atuendoRandom = new Random();
    this.filtrarPorAlerta();
    return atuendosSugeridos.get(atuendoRandom.nextInt(atuendosSugeridos.size()));
  }
  public List<Atuendo> filtrarPorAlerta(){
    return atuendosSugeridos;
  }
}
