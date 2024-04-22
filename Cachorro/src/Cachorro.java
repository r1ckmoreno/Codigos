import java.sql.SQLOutput;

public class Cachorro {
    String raca;
    int tamanho;
    String cor;
    boolean tem_rabo;

    void late() {
        if (tem_rabo == true) {
            System.out.println("\nEu sou da raça " + raca +
                    " de tamanho " + tamanho +
                    " da cor " + cor +
                    " e eu TENHO RABO ");
        }
        else {
            System.out.println("\nEu sou da raça " + raca +
                    " de tamanho " + tamanho +
                    " da cor " + cor +
                    " e eu nao TENHO RABO ");
        }
    }
}
