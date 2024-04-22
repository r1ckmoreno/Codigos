public class FuncionarioRegular extends Funcionario {
    public FuncionarioRegular(String nome, double salarioPorHora, int horasTrabalhadasPorMes) {
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
    }

    public double calcularSalarioMensal() {
        return getSalarioPorHora() * getHorasTrabalhadasPorMes();
    }
}
