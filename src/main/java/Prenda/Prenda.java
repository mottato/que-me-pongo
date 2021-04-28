package Prenda;

import Prenda.TipoDePrenda.TipoDePrenda;

import java.util.Objects;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private String colorPrincipal;
    private String colorSecundario;
    private Material material;

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, Material material) {
        this.tipoDePrenda = checkNonNullTipoDePrenda(tipoDePrenda);
        this.colorPrincipal = checkNonNullColorPrincipal(colorPrincipal);
        this.colorSecundario = null;
        this.material = checkNonNullMaterial(material);
    }

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, String colorSecundario, Material material) {
        this.tipoDePrenda = checkNonNullTipoDePrenda(tipoDePrenda);
        this.colorPrincipal = checkNonNullColorPrincipal(colorPrincipal);
        this.colorSecundario = colorSecundario;
        this.material = checkNonNullMaterial(material);
    }

    private Material checkNonNullMaterial(Material material) {
        return Objects.requireNonNull(material, "Debe seleccionar un material");
    }

    private String checkNonNullColorPrincipal(String colorPrincipal) {
        return Objects.requireNonNull(colorPrincipal, "Debe seleccionar un color principal");
    }

    private TipoDePrenda checkNonNullTipoDePrenda(TipoDePrenda tipoDePrenda) {
        return Objects.requireNonNull(tipoDePrenda, "Debe seleccionar un tipo de prenda");
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
