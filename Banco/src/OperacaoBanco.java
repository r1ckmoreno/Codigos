public class OperacaoBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, "Henrique");
        conta.depositar(100.0);
        conta.sacar(20.0);
        System.out.println(conta.getSaldo());
        System.out.println("Ate mais, Henrique!");
    }
}