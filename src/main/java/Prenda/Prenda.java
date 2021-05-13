package Prenda;

import Prenda.Material.Material;
import Prenda.Material.Trama;
import Prenda.TipoDePrenda.TipoDePrenda;

public class Prenda {
    private final TipoDePrenda tipoDePrenda;
    private final String colorPrincipal;
    private final String colorSecundario;
    private final Material material;
    private final Trama trama;

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, Material material, Trama trama) {
        this.tipoDePrenda = tipoDePrenda;
        this.colorPrincipal = colorPrincipal;
        this.trama = trama;
        this.colorSecundario = null;
        this.material = material;
    }

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, String colorSecundario, Material material, Trama trama) {
        this.tipoDePrenda = tipoDePrenda;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.trama = trama;
    }

    public TipoDePrenda getTipoDePrenda() {
        return tipoDePrenda;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }
}
