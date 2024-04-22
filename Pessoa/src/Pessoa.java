public class Pessoa {
    String nome;
    int idade;
    String cidadeResidencia;

    public Pessoa(String nome, int idade, String cidadeResidencia) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeResidencia = cidadeResidencia;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Cidade de Residencia: " + cidadeResidencia);
    }
}
