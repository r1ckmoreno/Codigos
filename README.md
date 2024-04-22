// Classe Animal
public class Animal {
    protected String nome;
    protected int idade;
    protected String somEmitido;
    
    public Animal(String nome, int idade, String somEmitido) {
        this.nome = nome;
        this.idade = idade;
        this.somEmitido = somEmitido;
    }
    
    public void emitirSom() {
        System.out.println(somEmitido);
    }
}

// Subclasse Mamifero
public class Mamifero extends Animal {
    private int quantidadeMamas;
    
    public Mamifero(String nome, int idade, int quantidadeMamas) {
        super(nome, idade, "Som de mamífero");
        this.quantidadeMamas = quantidadeMamas;
    }
}

// Subclasse Ave
public class Ave extends Animal {
    private double envergaduraAsas;
    
    public Ave(String nome, int idade, double envergaduraAsas) {
        super(nome, idade, "Som de ave");
        this.envergaduraAsas = envergaduraAsas;
    }
}

// Subclasse Peixe
public class Peixe extends Animal implements AnimalAquatico {
    private String habitat;
    
    public Peixe(String nome, int idade, String habitat) {
        super(nome, idade, "Som de peixe");
        this.habitat = habitat;
    }
    
    @Override
    public void nadar() {
        System.out.println("O peixe está nadando.");
    }
}

// Interface AnimalAquatico
public interface AnimalAquatico {
    void nadar();
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero("Leão", 5, 4);
        Ave aguia = new Ave("Águia", 3, 2.5);
        Peixe tubarao = new Peixe("Tubarão", 10, "Oceano");
        
        leao.emitirSom(); // Saída: Som de mamífero
        aguia.emitirSom(); // Saída: Som de ave
        tubarao.emitirSom(); // Saída: Som de peixe
        
        tubarao.nadar(); // Saída: O peixe está nadando.
    }
}