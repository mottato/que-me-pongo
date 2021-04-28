package Prenda.TipoDePrenda;

public class TipoDePrenda {
    private Tipo tipo;
    private Categoria categoria;

    public TipoDePrenda(Tipo tipo, Categoria categoria) {
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
