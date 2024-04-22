public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Henrique", 19, 3000);
        Gerente gerente = new Gerente("Max", 30, 5000, "Tecnologia da Informação");

        System.out.println("Informações do Funcionario: ");
        funcionario.info();


        System.out.println("\nInformações do Gerente: ");
        gerente.info();

    }
}
