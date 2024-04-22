public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void aumentarEstoque(int quant) {
        this.quantidade += quant;
    }

    public void diminuirEstoque(int quant) {
        this.quantidade -= quant;
    }
    public double valorTotalEstoque() {
        return quantidade * preco;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Pizza", 3, 4);

        System.out.println("Estoque de " + p1.nome + ": " + p1.valorTotalEstoque());
        p1.aumentarEstoque(20);
        System.out.println("Estoque de " + p1.nome + ": " + p1.valorTotalEstoque());
    }
}


