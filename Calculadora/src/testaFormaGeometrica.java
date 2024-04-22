public class testaFormaGeometrica {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5);
        Circulo c1 = new Circulo(3);

        System.out.println("Area do Quadrado: " + q1.calcularArea());
        System.out.println("Area do Circulo: " + c1.calcularArea());
    }
}
