import java.util.Scanner;

public class WhileEx08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        if (in.hasNextInt())
        {
            int t = in.nextInt();
            while (t >= 0) {
                System.out.printf("Faltam %d segundos. \n" ,t);
                t -= 1;
            }
            System.out.println("A contagem terminou.");

        }
        else
        {
            System.out.print("Erro: Por favor digite um valor válido ! \n");
        }

    }
}
