interface Promocao {
    double calcularDesconto();
}

class ProdutoEletronico implements Promocao {
    private String modelo;
    private String marca;
    private double preco;
    private boolean emPromocao;

    public ProdutoEletronico(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.emPromocao = false;
    }

    // Getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
    }

    @Override
    public double calcularDesconto() {
        if (emPromocao) {
            return preco * 0.9; // Desconto de 10%
        } else {
            return preco;
        }
    }
}

// Exemplo de uso:
public class Main {
    public static void main(String[] args) {
        ProdutoEletronico produto = new ProdutoEletronico("ModeloX", "MarcaY", 1000.0);

        produto.setEmPromocao(true);

        System.out.println("Preço do produto: " + produto.calcularDesconto());
    }
}
