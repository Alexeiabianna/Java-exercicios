import java.sql.SQLOutput;
import java.util.Scanner;

public class RepeticaoEx06 {
    public static void main(String[] args) {
        // 6) Escreva um programa que solicita do usuário um valor inteiro e depois imprime o valor com os dígitos
        // invertidos. Por exemplo, se o usuário digitar 12345, o programa imprime 54321.

        Scanner in = new Scanner(System.in);

//        Solução 01
//        System.out.print("Digite uma sequencia de números para inverter: ");
//        String str = in.next();
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.println(i);
//            char c = str.charAt(i);
//            System.out.print(c);
//        }
//      Solução 02

        System.out.print("Digite um número: ");
        if (in.hasNextInt()) {
            int n = in.nextInt();
            int invert = 0;

            while (n != 0) {
                int dig = n % 10;
                invert = invert * 10 + dig;
                System.out.println(invert);
                n /= 10;

            }

        }
        else {
            System.out.println("Erro: Digite números inteiros");
        }

    }
}
