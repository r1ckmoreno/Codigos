class Caminhao extends Veiculo implements Alugavel {
    private int capacidadeCarga;

    // Construtor
    public Caminhao(String modelo, String marca, int anoFabricacao, int capacidadeCarga) {
        super(modelo, marca, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Implementação dos métodos da interface Alugavel
    @Override
    public void alugar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Caminhão alugado.");
        } else {
            System.out.println("Caminhão indisponível para aluguel.");
        }
    }

    @Override
    public void devolver() {
        setDisponivel(true);
        System.out.println("Caminhão devolvido.");
    }
}