package Prenda;

import Prenda.Material.Material;
import Prenda.TipoDePrenda.TipoDePrenda;

import java.util.Objects;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private String colorPrincipal;
    private String colorSecundario;
    private Material material;
    private boolean esBorrador;

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, Material material) {
        this.tipoDePrenda = checkNonNullTipoDePrenda(tipoDePrenda);
        this.colorPrincipal = checkNonNullColorPrincipal(colorPrincipal);
        this.colorSecundario = null;
        this.material = checkNonNullMaterial(material);
        this.esBorrador = false;
    }

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, String colorSecundario, Material material) {
        this.tipoDePrenda = checkNonNullTipoDePrenda(tipoDePrenda);
        this.colorPrincipal = checkNonNullColorPrincipal(colorPrincipal);
        this.colorSecundario = colorSecundario;
        this.material = checkNonNullMaterial(material);
        this.esBorrador = false;
    }

    public void primerPaso(TipoDePrenda tipoDePrenda) {
        this.tipoDePrenda = tipoDePrenda;
        this.esBorrador = true;
    }

    public void segundoPaso(Material material, String colorPrincipal, String colorSecundario) {
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.esBorrador = true;
    }

    public void guardarBorrador(){
        // Guardaría en la BD el Borrador de la prenda
    }

    public void guardarPrenda() {
        chequearPrendaValida(this);
        this.esBorrador = false;
        // Al tener el chequeo de nulls, no se requiere lanzar excepciones adicionales.
        // => Guardar la prenda valida en la base de datos
    }

    private void chequearPrendaValida(Prenda prenda) {
        if(prenda.getColorPrincipal().isEmpty())
            throw new RuntimeException("El color principal debe ser elegido");
        if(prenda.getTipoDePrenda().getCategoria() == null)
            throw new RuntimeException("La categoría no puede ser nula");
        if(prenda.getTipoDePrenda().getTipo() == null)
            throw new RuntimeException("La tipo de prenda no puede ser nula");
        if(prenda.getMaterial().getTrama() == null)
            throw new RuntimeException("La trama no puede ser nula");
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
