import java.util.Scanner;

public class DowhileEx01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite um número entre 0 e 100: ");
            n = in.nextInt();

        }
        while (!(n < 100 && n > 0));
        System.out.println(n);

    }
}
