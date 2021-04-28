package Prenda.Material;

import java.util.Objects;

public class Material {
    private Trama trama;
    private Tela tela;

    public Material(Tela tela) {
        this.trama = Trama.LISA;
        this.tela = checkNonNullTela(tela);
    }

    public Material(Trama trama, Tela tela) {
        this.trama = trama == null ? Trama.LISA : trama;
        this.tela = checkNonNullTela(tela);
    }

    private Tela checkNonNullTela(Tela tela) {
        return Objects.requireNonNull(tela, "Debe especificar el tipo de tela");
    }

    public Trama getTrama() {
        return trama;
    }

    public Tela getTela() {
        return tela;
    }
}
