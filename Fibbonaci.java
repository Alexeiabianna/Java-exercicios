import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int input = in.nextInt();
        int n = fibo(input);

        System.out.println("O termo F" + input + " é " + n );
    }

    public static int fibo(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
