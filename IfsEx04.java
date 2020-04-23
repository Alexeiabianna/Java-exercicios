import java.util.Scanner;

public class IfsEx04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        Double price = in.nextDouble();
        Double discountedPrice = 0.0;

        /*if (price > 100)
        {
            discountedPrice = price - 20;
        }
        else if (price <= 100)
        {
            discountedPrice = price - 10;
        }*/

        //Pode ser melhorado seguindo o exemplo abaixo.

        if (price >= 100)
        {
            discountedPrice = price - 20;
        }
        else
        {
            discountedPrice = price - 10;
        }
        System.out.println("O valor do produto com desconto é de: " + discountedPrice);
    }
}