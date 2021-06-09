package prenda;

import prenda.material.Material;
import prenda.material.Trama;
import prenda.tipoDePrenda.TipoDePrenda;

import java.util.Objects;

public class Borrador {
    private TipoDePrenda tipoDePrenda;
    private String colorPrincipal;
    private String colorSecundario;
    private Material material;
    private Trama trama = Trama.LISA;
    private double temperaturaApta;

    public Borrador configurarTipoDePrenda(TipoDePrenda tipoDePrenda){
        this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda, "Debe seleccionar un tipo de prenda");
        return this;
    }

    public Borrador configurarMaterial(Material material){
        this.material = Objects.requireNonNull(material, "Debe seleccionar un material");;
        return this;
    }

    public Borrador configurarColorPrincipal(String colorPrincipal){
        this.colorPrincipal = Objects.requireNonNull(colorPrincipal, "Debe seleccionar un color principal");
        return this;
    }

    public Borrador configurarColorSecundario(String colorSecundario){
        this.colorSecundario = colorSecundario;
        return this;
    }

    public Borrador configurarTrama(Trama trama){
        this.trama = trama == null ? Trama.LISA : trama;
        return this;
    }

    private Borrador configurarTemperaturaApta(double temperaturaApta) {
        this.temperaturaApta = temperaturaApta;
        return this;

    }

    private Prenda crearPrenda() {
        chequearPrendaValida();
        return new Prenda(this.tipoDePrenda, this.colorPrincipal, this.colorSecundario, this.material, this.trama, this.temperaturaApta);
    }

    private void chequearPrendaValida() {
        if(this.tipoDePrenda.getCategoria() == null)
            throw new RuntimeException("La categoría no puede ser nula");
        if(this.colorPrincipal.isEmpty())
            throw new RuntimeException("El color principal debe ser elegido");
        if(this.tipoDePrenda.getTipo() == null)
            throw new RuntimeException("La tipo de prenda no puede ser nula");
        if(this.material == null)
            throw new RuntimeException("La trama no puede ser nula");
    }

}
