public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiesta", "Ford", 2019, 4);
        Van van = new Van("Sprinter", "Mercedes", 2020, 1500);
        Caminhao caminhao = new Caminhao("FH", "Volvo", 2021, 10000);

        carro.alugar();
        van.alugar();
        caminhao.alugar();

        carro.devolver();
        van.devolver();
        caminhao.devolver();
    }
}