// Classe ProdutoEletronico
public class ProdutoEletronico implements Promocao {
    private String modelo;
    private String marca;
    private double preco;
    
    public ProdutoEletronico(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
    
    // Getters e Setters
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
    
    // Método da interface Promocao
    @Override
    public void calcularDesconto() {
        // Implemente a lógica para calcular desconto, se necessário
        // Neste exemplo, não aplicaremos desconto aqui
    }
}

// Subclasse Smartphone
public class Smartphone extends ProdutoEletronico {
    private String sistemaOperacional;
    
    public Smartphone(String modelo, String marca, double preco, String sistemaOperacional) {
        super(modelo, marca, preco);
        this.sistemaOperacional = sistemaOperacional;
    }
}

// Subclasse Laptop
public class Laptop extends ProdutoEletronico {
    private int memoriaRAM;
    
    public Laptop(String modelo, String marca, double preco, int memoriaRAM) {
        super(modelo, marca, preco);
        this.memoriaRAM = memoriaRAM;
    }
}

// Subclasse TV
public class TV extends ProdutoEletronico {
    private double tamanhoTela;
    
    public TV(String modelo, String marca, double preco, double tamanhoTela) {
        super(modelo, marca, preco);
        this.tamanhoTela = tamanhoTela;
    }
}

// Interface Promocao
public interface Promocao {
    void calcularDesconto();
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Galaxy S20", "Samsung", 2000.0, "Android");
        Laptop laptop = new Laptop("Inspiron 15", "Dell", 2500.0, 8);
        TV tv = new TV("Smart TV LED 50", "LG", 3000.0, 50.0);
        
        smartphone.calcularDesconto();
        laptop.calcularDesconto();
        tv.calcularDesconto();
        
        // Neste exemplo, não aplicamos desconto, então os preços permanecem os mesmos
        System.out.println("Preço do smartphone: " + smartphone.getPreco());
        System.out.println("Preço do laptop: " + laptop.getPreco());
        System.out.println("Preço da TV: " + tv.getPreco());
    }
}