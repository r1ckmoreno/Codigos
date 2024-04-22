public class B extends A{
    private int k;

    public B(int a, int b, int c, int d){
        super(a, b, c);
        this.k = d;
    }

    public void imprimeValores() {
        System.out.print("\nValores de X é: " + this.x);
        System.out.print("\nValores de Y é:  " + this.y);
        System.out.print("\nValores de Z é:  " + this.k);
        System.out.print("\nZ não é visivel nesta classe.");
        System.out.print("\nValores de Z é: " + obterZ());
    }
}
