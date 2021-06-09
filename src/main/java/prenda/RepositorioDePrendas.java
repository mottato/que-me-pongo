package prenda;

import java.util.List;

public class RepositorioDePrendas {
    private List<Prenda> prendas;

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void agregarPrenda(Prenda prenda){
        this.prendas.add(prenda);
    }
}
