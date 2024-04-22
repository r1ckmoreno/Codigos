class Carro extends Veiculo implements Alugavel {
    private int quantidadePortas;

    // Construtor
    public Carro(String modelo, String marca, int anoFabricacao, int quantidadePortas) {
        super(modelo, marca, anoFabricacao);
        this.quantidadePortas = quantidadePortas;
    }

    // Implementação dos métodos da interface Alugavel
    @Override
    public void alugar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Carro alugado.");
        } else {
            System.out.println("Carro indisponível para aluguel.");
        }
    }

    @Override
    public void devolver() {
        setDisponivel(true);
        System.out.println("Carro devolvido.");
    }
}