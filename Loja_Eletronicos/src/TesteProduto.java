public class TesteProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Celular", 1000.00, 10);
        Produto produto2 = new Produto("Notebook", 2000.00, 5);

        exibirDetalhes(produto1);
        exibirDetalhes(produto2);

        produto1.adicionarEstoque(8);
        produto2.removerEstoque(2);

        exibirDetalhes(produto1);
        exibirDetalhes(produto2);
    }

    public static void exibirDetalhes(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço Unitário: " + produto.getPrecoUnitario());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
        System.out.println("-------------------------------------");
    }
}