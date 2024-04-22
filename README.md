class Van extends Veiculo implements Alugavel {
    private int capacidadeCarga;

    // Construtor
    public Van(String modelo, String marca, int anoFabricacao, int capacidadeCarga) {
        super(modelo, marca, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Implementação dos métodos da interface Alugavel
    @Override
    public void alugar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Van alugada.");
        } else {
            System.out.println("Van indisponível para aluguel.");
        }
    }

    @Override
    public void devolver() {
        setDisponivel(true);
        System.out.println("Van devolvida.");
    }
}