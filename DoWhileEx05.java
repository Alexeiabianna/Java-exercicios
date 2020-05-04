import java.util.Scanner;

public class DoWhileEx05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value;
        int sum = 0;
        
        do {
            System.out.print("Digite um valor para o somatório: ");
            value = in.nextInt();
            sum = sum + value;
        }
        while (value != 0);
        System.out.println("O somatório é: " + sum);
    }
}
