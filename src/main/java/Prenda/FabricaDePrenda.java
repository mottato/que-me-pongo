package Prenda;

import Prenda.TipoDePrenda.TipoDePrenda;

public class FabricaDePrenda {
    private Prenda prenda;

    public Prenda crearPrenda(TipoDePrenda tipoDePrenda, Material material, String colorPrincipal) {
        prenda.setTipoDePrenda(tipoDePrenda);
        prenda.setMaterial(material);
        prenda.setColorPrincipal(colorPrincipal);
        return prenda;
    }

}
