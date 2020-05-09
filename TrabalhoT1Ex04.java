import java.util.Scanner;

public class TrabalhoT1Ex04 {
    public static void main(String[] args) {
        int a;
        int b;
        a = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, digite um número: ");
        b = in.nextInt();
        if (b > 300)
        {
            a = b;
        }
        else
        {
            a = 0;
        }
        System.out.println("a: " + a);
    }
}
