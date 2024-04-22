import java.text.NumberFormat;

public class FormataNumeros {
    public static void main(String[] args) {
        System.out.println(NumberFormat.getCurrencyInstance().format(12345678.90));

        double vetor[] = {532.34, 54344.23, 765.334, 1084.786};
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for(int a = 0; a < vetor.length; a++) {
            if ( a != 0 )
                System.out.print(" - ");

            System.out.print(nf.format(vetor[a]));
        }
    }
}
