import java.text.NumberFormat;

public class FormataNumerosInt {
    public static void main(String[] args) {
        double vetor[] = {123.34, 231.56, 456.67};

        NumberFormat nf = NumberFormat.getIntegerInstance();

        for (int a = 0; a < vetor.length; a++) {
            if (a != 0)
                System.out.print(" - ");

            System.out.print(nf.format(vetor[a]));
        }
    }
}
