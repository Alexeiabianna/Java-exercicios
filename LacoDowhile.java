import java.util.Scanner;

public class LacoDowhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um valor numérico menor que 100: ");
            n = in.nextInt();
        } while (!(n < 100));
        System.out.println(n);
    }
}
