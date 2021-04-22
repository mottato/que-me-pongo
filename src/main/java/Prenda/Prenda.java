package Prenda;

import Prenda.TipoDePrenda.TipoDePrenda;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private String colorPrincipal;
    private String colorSecundario;
    private Material material;

    public TipoDePrenda getTipoDePrenda() {
        return tipoDePrenda;
    }

    public void setTipoDePrenda(TipoDePrenda tipoDePrenda) {
        this.tipoDePrenda = tipoDePrenda;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
