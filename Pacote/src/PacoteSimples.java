public class PacoteSimples extends Pacote {
    @Override
    public double calcularCustoEnvio(double peso){
        return peso * 1.5;
    }
}
