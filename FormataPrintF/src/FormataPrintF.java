public class FormataPrintF {
    public static void main(String[] args) {
        String minha_string = "Programação Orientada a Objetos";
        int meu_inteiro = 234;
        float meu_numero = 876.54f;

        System.out.println(minha_string + " - " + meu_inteiro + " - " + meu_numero );
        System.out.printf("%s - %d - %.2f", minha_string, meu_inteiro, meu_numero);
    }
}
