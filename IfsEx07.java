import java.util.Scanner;

public class IfsEx07 {
    public static void main(String[] args ) {

// 7. Um supermercado premia os clientes com cupons dependendo do quanto os mesmo gastaram nas compras.
// Por exemplo, se você gastar R$50,00, você irá receber um cupom com 8 por cento sobre o valor que você gastou.
// A tabela a seguir mostra os valores de cupons para os respectivos valores de compras.
        /*VALOR                             CUPOM
Menos que R$10                            Sem cupom
De R$10 até R$60                              8%
Mais que R$60 até R$150                      10%
Mais que R$150 até R$210                     12%
Mais que R$210                               14%*/

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor das compras: ");
        Double price = in.nextDouble();

        if (price < 10.00)
        {
            System.out.println("Promoção inválida");
        }

        else if (price > 10.00 && price <= 60.00)
        {
            price = price * 0.08;
            System.out.println("Você ganhou um cupom de desconto no valor de R$" + price + "(%8 de desconto sobre o valor total de sua compra). ");
        }

        else if (price > 60.00 && price <= 150.00 )
        {
            price = price * 0.10;
            System.out.println("Você ganhou um cupom de desconto no valor de R$" + price + "(%10 de desconto sobre o valor total de sua compra). ");
        }

        else if (price > 150.00 && price <= 210.00)
        {
            price = price * 0.12;
            System.out.println("Você ganhou um cupom de desconto no valor de R$" + price + "(%12 de desconto sobre o valor total de sua compra). ");
        }

        else if (price > 210.00)
        {
            price = price * 0.14;
            System.out.println("Você ganhou um cupom de desconto no valor de R$%.2f." + price + "(%0.f%% de desconto sobre o valor total de sua compra).\n");
        }


    }
}
