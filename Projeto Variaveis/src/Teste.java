import java.io.IOException;
public class Teste {

public static void main(String[] args) throws IOException {
    System.out.println("Olá, mundo!");
    char ch;
    ch = 'X';
    System.out.println("ch contains" + ch);
    ch++ ; //incremento ch
    System.out.println("ch is now" + ch);
    ch = 90; //dá a ch o valor Z
    System.out.println("ch is now" + ch);
    byte tipoByte = 127;
    short tipoShort = 32767;
    char tipoChar = 'C';
    float tipoFloat = 2.6f;
    double tipoDouble = 3.59;
    int tipoInt = 2147483647;
    long tipoLong = 9223372036854775807L;
    boolean tipoBooleano = true;

    System.out.println("Valor do tipoByte = " + tipoByte);
    System.out.println("Valor do tipoShort = " + tipoShort);
    System.out.println("Valor do tipoChar = " + tipoChar);
    System.out.println("Valor do tipoFloat = " + tipoFloat);
    System.out.println("Valor do tipoDouble = " + tipoDouble);
    System.out.println("Valor do tipoInt = " + tipoInt);
    System.out.println("Valor do tipoLong = " + tipoLong);
    System.out.println("Valor do tipoBoleano = " + tipoBooleano);

    //Demonstro sequencias de escape em strings.
    System.out.println("\nFirst line\nSecond line");
    System.out.println("A\tB\tC");
    System.out.println("D\tE\tF\n");

    //Demonstro valores booleanos.
    boolean b;
    b = false;
    System.out.println("b is " + b);
    b = true;
    System.out.println("b is" + b);
    //um valor booleano pode controlar a instrução if
    if(b) System.out.println("This is executed.");
    b = false;
    if(b) System.out.println("This is executed.");
    //o resultado de um operador relacional é um valor booleano
    System.out.println("18 > 9 is " + (10 > 9));

   //Demonstra o escopo de bloco
    int m; //conhecida pelo codigo dentro da main()
    m = 10;
    if(m == 10) { //inicia novo codigo
        int n = 20; //conhecida apenas nesse bloco
        //tanto m quanto n sao conhecidos aqui
        System.out.println("m and n: " + m + " " + n);
        m = n * 2;
    }
    //n = 100; //Erro! n nao é conhecido aqui
    // m ainda é conhecida aqui.
    System.out.println("m is " + m);

    //Demonstra o tempo de vida de uma variavel
    for(int i = 0; i < 3; i++) {
        int j = -1; // y sera inicializado sempre que entrarmos no bloco
        System.out.println("j is: " + j); // essa linha sempre exibe -1
        j = 100;
        System.out.println("j is now: " + j);
    }

    // Demonstro os operadores relacionais e logicos.
    int i, j; boolean b1, b2;
    i = 10;
    j = 11;
    if(i < j) System.out.println("\ni < j");
    if(i <= j) System.out.println("i <= j");
    if(i != j) System.out.println("i != j");
    if(i == j) System.out.println("this won't execute");
    if(i >= j) System.out.println("this won't execute");

    b1 = true;
    b2 = false;
    if(b1)
  }
}
