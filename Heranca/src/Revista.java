public class Revista extends Material {
    public Revista(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 4.0; // Multa para revista é 4.0 por dia de atraso (longo prazo)
    }
}