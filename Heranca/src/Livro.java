public class Livro extends Material {
    public Livro(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 2.0; // Multa para livro é 2.0 por dia de atraso (curto prazo)
    }
}
