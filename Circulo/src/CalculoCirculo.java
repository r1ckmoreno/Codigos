public class CalculoCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("A area do círculo eh de " + circulo.calcularArea());
        System.out.println("O perimetro do circulo eh de " + circulo.calcularPerimetro());
    }
}