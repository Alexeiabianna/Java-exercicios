import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número para calcular seu fatorial: ");
        int input = in.nextInt();
        int n = fatorial(input);
        System.out.println("O Fatorial de " + input + " é igual a " + n);

    }

    public static int fatorial(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n * fatorial(n - 1);
        }
    }
}
