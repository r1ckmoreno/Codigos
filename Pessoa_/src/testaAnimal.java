public class testaAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();
        Animal animal3 = new Animal();

        animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();
    }
}
