public class TesteFuncionario {
    public static void main(String[] args) {

        FuncionarioRegular regular1 = new FuncionarioRegular("Max", 20.0, 180);

        System.out.println("\nFuncionário Regular:");
        System.out.println("\nNome: " + regular1.getNome());
        System.out.println("Salário Mensal: R$" + regular1.calcularSalarioMensal());

        FuncionarioTerceirizado terceirizado1 = new FuncionarioTerceirizado("Henrique", 23.0, 180, 500.0);

        System.out.println("\nFuncionário Terceirizado:");
        System.out.println("\nNome: " + terceirizado1.getNome());
        System.out.println("Salário Mensal: R$" + terceirizado1.calcularSalarioMensal());
    }
}