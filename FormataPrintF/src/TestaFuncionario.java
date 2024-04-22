public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        f1.nome = "Alex";
        f2.nome = "Carol";
        f3.nome = "Ana";

        f1.salario = 1000;
        f2.salario = 2000;
        f3.salario = 3000;

        f1.setIdade(20);
        f2.setIdade(18);
        f3.setIdade(19);

        System.out.printf("\nSalário de [%s] 1: %.2f com idade de %d",f1.nome, f1.salario, f1.getIdade());
        System.out.printf("\nSalário de [%s] 1: %.2f com idade de %d", f2.nome, f2.salario, f2.getIdade());
        System.out.printf("\nSalário de [%s] 1: %.2f com idade de %d", f3.nome, f3.salario, f3.getIdade());
    }
}
