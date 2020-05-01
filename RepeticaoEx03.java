import java.util.Scanner;

public class RepeticaoEx03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        if (in.hasNextInt()) {
            int n = in.nextInt();
            int l = 0;
            while (l < 10) {
                l++;
                int r = n * l;
                System.out.println(n + " x " + l + " = " + r);
            }
        }else {
            System.out.println("Erro: Número inválido, por favor digite um número inteiro maior ou igual a zero ");
        }

    }
}
