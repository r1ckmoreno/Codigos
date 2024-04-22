public class testaCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(5, 3));
        System.out.println(calc.soma(2.5, 3.5));
        System.out.println(calc.soma(2, 3, 4));
        System.out.println(calc.soma(2, 2.5));
    }
}
