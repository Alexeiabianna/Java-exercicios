/* Esse programa le numeros e os tranforma em codigo de barras
 *
 *  Pedro Nunes e Alexei Abianna
 */
import java.util.Scanner;
public class LeitorDeNumeros{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Insira o Codigo Postal que será transformado em codigo de barras: ");
        imprimeCodigoBarra(in.nextLine());
    }

    /**
     Esse metodo recebe um valor numérico e imprime um código de barras correspondente.
     @Parm zipCode é o código postal.
     */
    public static void imprimeCodigoBarra(String zipCode){
        int checkDigit = 0;
        // verifica se o valor do zipCode é valido
        if(zipCode.length() == 5){
            // imprime a primeira barra de cotrole
            System.out.print('|');
            // le cada digito
            for(int i = 0; i <= 4; i++){
                // imprime os digitos em forma de codigo de barras
                imprimeDigito(zipCode.charAt(i));
                // descreve a soma dos numeros para calcular o digito de verificação
                checkDigit += Character.getNumericValue(zipCode.charAt(i));
            }

            // Testa um caso especial do digito auxiliar
            if(checkDigit % 10 == 0 ) {
                checkDigit = 0;
            }
            else{
                checkDigit = 10 - (checkDigit % 10);
            }
            // imprime o "check digit" em forma de codigo de barras
            imprimeDigito((checkDigit + "").charAt(0));
            // imprime a segunda barra de cotrole
            System.out.print('|');
        }
        else{
            System.out.println("Erro: Codigo não tem 5 digitos.");
        }
    }

    /**
     * Esse metodo imprime o código de barra de um número.
     * @Param d é o número que será transformado em código de barra
     */
    public static void imprimeDigito(char d){
        // atribui um codigo a cada numero
        switch (d) {
            case '0': System.out.print("||:::"); break;
            case '1': System.out.print(":::||"); break;
            case '2': System.out.print("::|:|"); break;
            case '3': System.out.print("::||:"); break;
            case '4': System.out.print(":|::|"); break;
            case '5': System.out.print(":|:|:"); break;
            case '6': System.out.print(":||::"); break;
            case '7': System.out.print("|:::|"); break;
            case '8': System.out.print("|::|:"); break;
            case '9': System.out.print("|:|::"); break;
            default: System.out.print(" VALOR INVALIDO ");
        }
    }
}
