import java.util.Scanner;
import java.util.Random;

public class MontyHallGamer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Seja Bem Vindo ao Jogo Monty Hall");

        //Porta premiada

        int portaPremiada = random.nextInt(3) + 1;

        //Porta escolhida
        System.out.println("Escolha 1 porta entre 1 a 3:  ");
        int portaEscolhida = scanner.nextInt();

        int portaVazia;
        do {
            portaVazia = random.nextInt(3) + 1;
        }
        while (portaVazia == portaPremiada || portaVazia == portaEscolhida);

        System.out.println("O apresentador abriu a porta " + portaVazia + " que está vazia");

        System.out.println("Voce deseja trocar de porta(s/n)? ");
        String trocar = scanner.next();

        if (trocar.equalsIgnoreCase("s")) {
            // Troca de porta
            do {
                portaEscolhida = random.nextInt(3) + 1;
            } while (portaEscolhida == portaVazia || portaEscolhida == portaEscolhida);
        }

        if (portaEscolhida == portaPremiada) {
            System.out.println("Você ganhou! Parabéns!");
        } else {
            System.out.println("Você perdeu. A porta premiada era a " + portaPremiada + ".");
        }

        scanner.close();
    }
}

