import java.util.Scanner;
import java.io.*;

public class EntradaDados {
    public static void main(String[] args) {
        // Leitura utilizando o Scanner
        Scanner entrada = new Scanner(System.in);

        //Variaveis
        String nome;
        int idade;

        System.out.println("Digite um nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        System.out.printf("Nome informado foi %s com idade de %d.", nome, idade);
    }
}
