import java.util.Scanner;

public class Extemp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor de temperatura: ");
        int temp = in.nextInt();

        if (temp > 0 && temp < 100) {
            System.out.println("Não está no estado liquido");
        }
    }
}
