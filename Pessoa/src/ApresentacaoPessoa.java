public class ApresentacaoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Henrique", 18, "Belo Horizonte");
        Pessoa pessoa2 = new Pessoa("Marcelo", 20, "Rio de Janeiro");

        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}