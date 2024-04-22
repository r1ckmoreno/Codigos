public class A {
    protected int x, y;
    private int z;

    public A(int a, int b, int c){
        this.x = a;
        this.y = b;
        this.z = c;
    }
    public int obterX() {
        return this.x;
    }
    public int obterY() {
        return this.y;
    }
    public int obterZ() {
        return this.z;
    }

    public void alterarX(int a) {
        this.x = a;
    }
    public void alterarY(int a) {
        this.y = a;
    }
    public void alterarZ(int a) {
        this.z = a;
    }
    public void imprimeValores() {
        System.out.print("Valor de X é:  " + this.x);
        System.out.print("Valor de Y é:  " + this.y);
        System.out.print("Valor de Z é:  " + this.z);
    }
}
