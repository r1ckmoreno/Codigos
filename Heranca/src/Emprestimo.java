public class Emprestimo {
    private Material material;
    private int diasAtraso;
    private double taxaMultaCurtoPrazo;
    private double taxaMultaLongoPrazo;

    public Emprestimo(Material material, int diasAtraso, double taxaMultaCurtoPrazo, double taxaMultaLongoPrazo) {
        this.material = material;
        this.diasAtraso = diasAtraso;
        this.taxaMultaCurtoPrazo = taxaMultaCurtoPrazo;
        this.taxaMultaLongoPrazo = taxaMultaLongoPrazo;
    }

    public double calcularMulta() {
        if (taxaMultaCurtoPrazo > 0 && diasAtraso <= 7) {
            return diasAtraso * taxaMultaCurtoPrazo;
        } else {
            return diasAtraso * taxaMultaLongoPrazo;
        }
    }
}