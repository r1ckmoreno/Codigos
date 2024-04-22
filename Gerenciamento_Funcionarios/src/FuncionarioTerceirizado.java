public class FuncionarioTerceirizado extends Funcionario {
    private double adicionalServicoTerceirizado;

    public FuncionarioTerceirizado(String nome, double salarioPorHora, int horasTrabalhadasPorMes, double adicionalServicoTerceirizado) {
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
        this.adicionalServicoTerceirizado = adicionalServicoTerceirizado;
    }

    public double getAdicionalServicoTerceirizado() {
        return adicionalServicoTerceirizado;
    }

    public void setAdicionalServicoTerceirizado(double adicionalServicoTerceirizado) {
        this.adicionalServicoTerceirizado = adicionalServicoTerceirizado;
    }

    public double calcularSalarioMensal() {
        return (getSalarioPorHora() * getHorasTrabalhadasPorMes()) + adicionalServicoTerceirizado;
    }
}