import java.util.Scanner;

public class Iniciais {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Solicita e armazena os nomes do par

        System.out.print("Entre com o seu primeiro nome: ");
        String primeiroNome = in.next();
        System.out.print("Entre com o nome da outra pessoa: ");
        String segundoNome = in.next();

        // Calcula e imprime as iniciais

        String iniciais = primeiroNome.substring(0, 1)
                + "&" + segundoNome.substring(0, 1);
        System.out.println(iniciais);
    }
}
