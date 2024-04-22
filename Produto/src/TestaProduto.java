public class TestaProduto{
    public static void main(String[] args) {
        Produto p1 = new Produto("Blusa", 15);
        Produto p2 = new Produto("Short", 20);

        double precoTotal1 = p1.calcularPrecoTotal();
        double precoTotal2 = p2.calcularPrecoTotal();

        int quantidade1 = 7;
        int quantidade2 = 4;

        double precoTotal3 = p1.calcularPrecoTotal(quantidade1);
        double precoTotal4 = p2.calcularPrecoTotal(quantidade2);

        System.out.println("Preço total para uma unidade de " + p1.nome + ": $" + precoTotal1);
        System.out.println("Preço total para uma unidade de " + p2.nome + ": $" + precoTotal2);
        System.out.println("Preço total para " + quantidade1 + " unidades de " + p1.nome + ": $" + precoTotal3);
        System.out.println("Preço total para " + quantidade2 + " unidades de " + p2.nome + ": $" + precoTotal4);

    }
}

