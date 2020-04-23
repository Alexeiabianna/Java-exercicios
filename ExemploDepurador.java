public class ExemploDepurador {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int aux = b;
        b = a;
        a = aux;

        System.out.println("var a: " + a);
        System.out.println("var b: " + b);

    }
}
