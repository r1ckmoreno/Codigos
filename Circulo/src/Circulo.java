public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return 3.14 * (raio * raio); // Substituindo Math.pow(raio, 2) por (raio * raio)
    }

    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}
