import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileEx02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor entre 0 e 100: ");
        int n = in.nextInt();

        while (n <= 0 && n >= 100){
            System.out.print("Digite um valor entre 0 e 100: ");
            n = in.nextInt();
        }
    }
}
