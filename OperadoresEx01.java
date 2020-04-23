import java.util.Scanner;

public class OperadoresEx01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com um valor inteiro: ");
        int m = in.nextInt();
        System.out.print("Entre com outro valor inteiro: ");
        int n = in.nextInt();
        System.out.println(m + " " + n);

    }
}
// Acontece um erro pois a entrada para a string "dois" não foi previamente validada.


