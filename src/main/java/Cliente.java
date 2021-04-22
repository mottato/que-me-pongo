import Prenda.Prenda;

public class Cliente {
    private Guardarropas guardarropas;

    private void cargarPrenda(Prenda prenda) {
        guardarropas.agregarPrenda(prenda);
    }

    private Atuendo generarAtuendo() {
        return new Atuendo();
    }
}
