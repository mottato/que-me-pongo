package usuario;

import clima.Alerta;
import clima.CondicionesClimaticas;

public abstract class Notificacion {
  private Alerta alerta;

  public CondicionesClimaticas condicionClimaticaDeUnaAlerta(Alerta alerta){
    return alerta.getCondicionesClimaticas();
  }

  public void notificarAlertaDeLluvia(Usuario usuario){
    if(this.condicionClimaticaDeUnaAlerta(alerta)==CondicionesClimaticas.LLUVIA){
      usuario.llevarParaguas();
    } else if(this.condicionClimaticaDeUnaAlerta(alerta)==CondicionesClimaticas.GRANIZO) {
      usuario.viajarEnAuto();
    }
    }
}
