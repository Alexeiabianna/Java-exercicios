import java.util.Scanner;

public class IfsEx03 {
    public static void main(String[] args) {

        /*3. Como é possível escrever a resposta de exercício anterior com apenas duas ramificações?*/

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = in.nextInt();

        if (x == 0)
        {
            int s = 0;
            System.out.println("O valor de S = " + s);
        }

        else if (x > 1)
        {
            int s = 1;
            System.out.println("O valor de S = " + s);
        }

        else
        {
            int s = -1;
            System.out.println("O valor de S = " + s);
        }

    }
}
