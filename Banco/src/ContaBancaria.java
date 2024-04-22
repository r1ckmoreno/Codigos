public class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Numero da Conta: " + numero + " - Titular: " + titular + " - Deposito de " + valor + " realizado. Novo saldo eh de " + saldo + ".");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Numero da Conta: " + numero + " - Titular: " + titular + " - Saque de " + valor + " realizado. Novo saldo eh de " + saldo + ".");
        } else {
            System.out.println("Numero da Conta: " + numero + " - Titular: " + titular + " - Saldo insuficiente para saque.");
        }
    }

    String getSaldo() {
        return "Numero da Conta: " + numero + " - Titular: " + titular + " - Saldo atual eh de " + saldo + ".";
    }
}