public class Funcionario {
    public String nome;
    public double salario;
    private int idade;

    public void AumentarSalario(double aumento) {
        this.salario+=aumento;
    }

    public void setIdade( int valor ) {
        this.idade = valor;
    }

    public int getIdade() {
        return this.idade;
    }
}
