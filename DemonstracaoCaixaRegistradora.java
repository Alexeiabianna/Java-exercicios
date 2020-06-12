import java.util.Scanner;

public class DemonstracaoCaixaRegistradora {
    public static void main(String[] args) {

        // Ler o código de barra
        Scanner in = new Scanner(System.in);
        String cod = in.next();

        // Imprimir o código
        imprimeCodigoBarra(cod);

    }
    public static void imprimeDigito(char d) {
        if (d == '0') {
            System.out.print("||:::");
        }
    }
    public static void imprimeCodigoBarra(String zipCode){
        // imprimir uma barra /
        // faz chamadas 5 chamadas imprimeDigito
        // calcular o dígito verificador

    }
}
