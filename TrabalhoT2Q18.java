import java.util.Scanner;

public class TrabalhoT2Q18 {
    public static void main(String[] args) {
        int[] notas = new int[10];
        int total = 0;
        Scanner in = new Scanner(System.in);
        for (int cnt = 1; cnt <= 10; cnt++)
        {
            System.out.print("Entre com os valores das notas: ");
            notas[cnt] = in.nextInt();
            total = total + notas[cnt];
        }
        System.out.println(total);
    }
}
