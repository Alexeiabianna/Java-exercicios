import java.util.Scanner;

public class IfsEx02 {
    public static void main(String[] args) {

        /*2. Assuma que uma entrada inteira foi lida do teclado e armazenada na variável x.
        Escreva um condicional com três ramificações que atribui a uma variável s o valor 1 caso x seja positivo,
        -1 caso x seja negativo e 0 se x for zero.
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = in.nextInt();

        if (x > 1)
        {
            int s = 1;
            System.out.println("O valor de S = " + s);
        }

        else if (x < 1)
        {
            int s = -1;
            System.out.println("O valor de S = " + s);
        }

        else if (x == 0)
        {
            int s = 0;
            System.out.println("O valor de S = " + s);
        }
    }
}
