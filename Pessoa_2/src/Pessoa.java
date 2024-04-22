public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    Livro livroFavorito;
    void fazerAniversario() {
        idade++;
    }

    public Pessoa( String n, String s, int i) {

        nome = n;
        idade = i;
        sobrenome = s;
    }
}
