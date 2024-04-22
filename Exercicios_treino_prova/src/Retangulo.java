public class Retangulo {
    double comprimento;
    double largura;

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea(){
       return comprimento * largura;
    }

    public double calcularPerimetro(){
        return 2 * comprimento + largura;
    }

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(12, 24);

        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
    }
}
