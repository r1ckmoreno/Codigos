public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Anderson ", "Silva",53);

        p1.nome = "Anderson ";
        p1.idade = 53;

        p1.nome = "Henrique";
        p1.sobrenome = "Moreno";

        System.out.println("Nome: " + p1.nome);
        System.out.println("Sobrenome: " + p1.sobrenome);
        System.out.println("Idade: " + p1.idade + " anos");

        p1.fazerAniversario();
        System.out.println("Idade: " + p1.idade + " anos");
        p1.fazerAniversario();
        p1.fazerAniversario();
        p1.fazerAniversario();
        System.out.println("Idade: " + p1.idade + " anos");

        Livro l1 = new Livro();
        l1.titulo = "Programacao Orientada a Objetos";
        l1.autor = "Max Santiago";

        p1.livroFavorito = l1;

        System.out.println("Pessoa: " + p1.nome +
                "\nIdade: " + p1.idade + " anos" +
                "\nLivro Favorito: " + p1.livroFavorito.titulo);
    }
}