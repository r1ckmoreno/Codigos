public class TestaPacote {
    public static void main(String[] args) {
        PacoteSimples ps = new PacoteSimples();
        PacoteExpresso pe = new PacoteExpresso();

        double pesoPacote = 15.0;

        double custoSimples = ps.calcularCustoEnvio(pesoPacote);
        double custoExpresso = pe.calcularCustoEnvio(pesoPacote);

        System.out.println("Custo de envio do Pacote Simples é de: $" + custoSimples);
        System.out.println("Custo de envio do Pacote Expresso é de: $" + custoExpresso);
    }
}
