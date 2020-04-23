import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Por favor, entre o preço da unidade: ");
        double precoUnitario = in.nextDouble();
        System.out.print("Por favor, entre com a quantidade: ");
        int quantidade = in.nextInt();
        double total = precoUnitario * quantidade;
        System.out.print("O valor total ficou em: " + total);


    }


}
