import java.util.ArrayList;
import java.util.Scanner;

public class BigBrotherBrasil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> participantes = new ArrayList<>();
        ArrayList<Integer> votos = new ArrayList<>();

        System.out.println("Bem-vindo ao sistema de eliminação do Big Brother Brasil!");

        // Adiciona participantes
        System.out.println("Digite o nome dos participantes (digite 'fim' para encerrar):");
        String nome;
        while (true) {
            nome = scanner.nextLine();
            if (nome.equals("fim")) break;
            participantes.add(nome);
            votos.add(0); // Inicializa votos de cada participante como 0
        }

        // Simulação de votação
        System.out.println("Digite os votos para cada participante:");
        for (int i = 0; i < participantes.size(); i++) {
            System.out.print("Votos para " + participantes.get(i) + ": ");
            int voto = scanner.nextInt();
            votos.set(i, voto);
        }

        // Mostra resultados
        System.out.println("Resultados da votação:");
        for (int i = 0; i < participantes.size(); i++) {
            System.out.println(participantes.get(i) + ": " + votos.get(i) + " votos");
        }

        // Encontra o participante com mais votos
        int maiorVotos = -1;
        int indiceMaiorVotos = -1;
        for (int i = 0; i < votos.size(); i++) {
            if (votos.get(i) > maiorVotos) {
                maiorVotos = votos.get(i);
                indiceMaiorVotos = i;
            }
        }

        String participanteEliminado = participantes.get(indiceMaiorVotos);

        System.out.println("O participante eliminado é: " + participanteEliminado);
    }
}

