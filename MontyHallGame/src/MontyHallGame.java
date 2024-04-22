import java.util.Scanner;
import java.util.Random;

public class MontyHallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao jogo Monty Hall!");

        //porta premiada
        int portaPremiada = random.nextInt(3) + 1;

        // porta escolhida
        System.out.print("Escolha uma porta (1, 2 ou 3): ");
        int portaEscolhida = scanner.nextInt();

        // porta vazia
        int portaVazia;
        do {
            portaVazia = random.nextInt(3) + 1;
        } while (portaVazia == portaPremiada || portaVazia == portaEscolhida);

        System.out.println("O apresentador abriu a porta " + portaVazia + " que está vazia.");

        //deseja trocar de porta?
        System.out.print("Você deseja trocar para a outra porta? (s/n): ");
        String trocar = scanner.next();

        if (trocar.equalsIgnoreCase("s")) {
            // Troca de porta
            do {
                portaEscolhida = random.nextInt(3) + 1;
            } while (portaEscolhida == portaVazia || portaEscolhida == portaEscolhida);
        }

        // Verificação do resultado
        if (portaEscolhida == portaPremiada) {
            System.out.println("Você ganhou! Parabéns!");
        } else {
            System.out.println("Você perdeu. A porta premiada era a " + portaPremiada + ".");
        }

        scanner.close();
    }
}

