public class TestaLivro {
    public static void main(String[] args) {
        LivroFisico lf = new LivroFisico("Codigo da Vinci" , "Maquiavel", 1920, 80, 2);

        System.out.println("Titulo: " + lf.getTitulo());
        System.out.println("Autor: " + lf.getAutor());
        System.out.println("Ano de Publicacao: " + lf.getAnoPublicacao());
        System.out.println("Preço: " + lf.getPreco());
        System.out.println("Peso: " + lf.getPeso());
    }
}
