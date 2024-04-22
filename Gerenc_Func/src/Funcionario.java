public class Funcionario {

    String nome;
    int idade;
    double salario;

    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario){
        this.salario = salario;
    }

    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }
}


