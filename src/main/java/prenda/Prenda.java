package prenda;

import prenda.material.Material;
import prenda.material.Trama;
import prenda.tipoDePrenda.TipoDePrenda;

public class Prenda {
    private final TipoDePrenda tipoDePrenda;
    private final String colorPrincipal;
    private final String colorSecundario;
    private final Material material;
    private final Trama trama;
    private final double temperaturaMaxima;

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, String colorSecundario, Material material,
                  Trama trama, double temperaturaMaxima) {
        this.tipoDePrenda = tipoDePrenda;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.trama = trama;
        this.temperaturaMaxima = temperaturaMaxima;
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

    public Trama getTrama() {
        return trama;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
}
