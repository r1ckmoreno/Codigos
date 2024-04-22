public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Algorítimo e Lógica de Programação", 2019);
        Revista revista = new Revista("Veja", 2024);

        String Livro = "Algorítimo e Lógica de Programação";
        String Revista = "Veja";

        double taxaMultaCurtoPrazo = 2.0;
        double taxaMultaLongoPrazo = 4.0;
        int diasAtrasoCurtoPrazo = 5;
        int diasAtrasoLongoPrazo = 10;

        Emprestimo emprestimoCurtoPrazo = new Emprestimo(livro, diasAtrasoCurtoPrazo, taxaMultaCurtoPrazo, taxaMultaLongoPrazo);
        Emprestimo emprestimoLongoPrazo = new Emprestimo(revista, diasAtrasoLongoPrazo, taxaMultaCurtoPrazo, taxaMultaLongoPrazo);

        double multaCurtoPrazo = emprestimoCurtoPrazo.calcularMulta();
        double multaLongoPrazo = emprestimoLongoPrazo.calcularMulta();

        System.out.println("Multa por atraso em empréstimo de curto prazo para o livro " + Livro + ", é de: R$" + multaCurtoPrazo);
        System.out.println("Multa por atraso em empréstimo de longo prazo para a revista " + Revista + ", é de: R$" + multaLongoPrazo);
    }
}