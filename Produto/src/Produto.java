public class Produto {
    String nome;
    double precoUnitario;

    public Produto(String nome, double precoUnitario){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }
    public double calcularPrecoTotal() {
        return this.precoUnitario;
    }
    public double calcularPrecoTotal(int quantidade) {
        return this.precoUnitario * quantidade;
    }
}
