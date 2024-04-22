import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        System.out.println("Exemplo do while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("********** Exercicios **********");
            System.out.println("Opção 1: Exercicio 1");
            System.out.println("Opção 2: Exercicio 2");
            System.out.println("Opção 3: Exercicio 3");
            System.out.println("Opção 0: Sair");
            System.out.println("*****************************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("*****************************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.");
                    exercicio3();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida.");
                    // Sair
                    break;
                default:
                    System.out.println("O número escolhido é inválido!");
            }
        }while(opcao != 0);
    }
    private static void exercicio1() {
        //1) Faça um programa que receba quatro números inteiros,
        // calcule e mostre a soma desses números.
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 4; i++){
            System.out.println("Digite o " + i + "° número: ");
            soma += scn.nextInt();
        }
        System.out.println("A soma é: " + soma);
    }
    private static void exercicio2() {
        //2) Faça um programa que receba três notas,
        // calcule e mostre a média aritmética entre elas.
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 3; i++){
            System.out.println("Digite a " + i + "° nota: ");
            soma += scn.nextInt();
        }
        System.out.println("A média é: " + soma/3);
    }
    private static void exercicio3() {
        //3) Faça um programa que receba o salário de um funcionário,
        // calcule e mostre o novo salário, sabendo-se que este
        // sofreu um aumento de 25%.
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salarioAtual = scn.nextDouble();
        double aumento = salarioAtual * 0.25;
        double novoSalario = salarioAtual + aumento;
        System.out.println("Novo salário com aumento: " + novoSalario);
        System.out.println("Seu aumento foi de: " + aumento);
    }

    //4) Faça um programa que receba o salário de um funcionário e o
    //percentual de aumento, calcule e mostre o valor do aumento e o novo
    //salário.
    private static void exercicio4() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDigite o salário: ");
        double salario = scn.nextDouble();
        System.out.println("\nDigite o percentual de aumento: ");
        double percentualAumento = scn.nextDouble();
        double aumento = salario * (percentualAumento / 100);
        double novoSalario = salario + aumento;
        System.out.println("Você obteve um aumento de: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
    }

    //5) Faça um programa que receba o salário base de um funcionário,
    //calcule e mostre o salário a receber, sabendo-se que o funcionário tem
    //gratificação de 5% sobre o salário base e paga imposto de 7% sobre este
    //salário.
    private static void exercicio5() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDigite o salário: ");
        double salario = scn.nextDouble();
        double gratificacao = salario * 0.05;
        double novoSalario = salario + gratificacao;
        double imposto = novoSalario * 0.07;
        double novoSalarioDescontado = novoSalario - imposto;
        System.out.println("Sua gratificação foi de 5%: " + gratificacao);
        System.out.println("Seu novo salário com a gratificação é: " + novoSalario);
        System.out.println("O imposto de 7% será de: " + imposto);
        System.out.println("Seu novo salário descontado do imposto é: " + novoSalarioDescontado);
    }
}
