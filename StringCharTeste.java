import java.util.Scanner;

public class StringCharTeste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String str = in.next();

        for(int i = 1; i <= 25; i += 5){
            str.substring(i, (i + 5));
            System.out.println(str);
        }
    }
}
