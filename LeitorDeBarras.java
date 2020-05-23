/*
 * Esse programa le um codigo de barras e devolve o codigo postal
 *
 * Pedro Nunes e Alexei Abianna
 */
import java.util.Scanner;
public class LeitorDeBarras{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("insira o codigo de barras: ");
        String codigoBarras = in.next();
        transformaBarra(codigoBarras);
    }

    /**
     * Esse metodo imprime um número de um respectivo código de barras.
     * @param codigoBarra é o codigo de barras.
     */
    public static void transformaBarra(String codigoBarra){
        // verifica se tem o numero correto de barras
        if(codigoBarra.length() == 32){

            String zipCode = "";
            // pega o valor numerico do codigo de barras
            for(int i = 1; i <= 25; i += 5){
                zipCode += digitoDaBarra(codigoBarra.substring(i, (i + 5)));
            }

            int checkDigit = 0;
            // Verifica se todos os caracteres são barras
            if(zipCode.length() == 5){
                // Calcula o digito de verificação
                for(int i = 0; i <= 4; i++){
                    checkDigit += Character.getNumericValue(zipCode.charAt(i));
                }

                // Testa um caso especial do digito de verificação
                if(checkDigit % 10 == 0 ) {
                    checkDigit = 0;
                }
                else{
                    checkDigit = 10 - (checkDigit % 10);
                }

                // pega o valor numerico do digito de verificação dado pelo usuario
                int verifica = Character.getNumericValue(digitoDaBarra(codigoBarra.substring(26, 31)).charAt(0));

                // Verifica o digito de verificação
                if(checkDigit == verifica){
                    System.out.println("Seu codigo numerico é: " + zipCode);
                }
                else{
                    System.out.println("Erro: Seu codigo de verificação é invalido.");
                }

            }
            else{
                System.out.println("Error: o codigo tem um caracter invalido.");
            }
        }
        else{
            System.out.println("Erro: o codigo não tem 32 barras.");
        }
    }

    /**
     * Esse metodo atribui um numero a cada 5 barras.
     * @Param codBarra é a barra que será transformada em número.
     * @return é o numero obtido.
     */
    public static String digitoDaBarra(String codBarra){
        // atribui um numero a cada 5 barras
        switch (codBarra) {
            case "||:::": return "0";
            case ":::||": return "1";
            case "::|:|": return "2";
            case "::||:": return "3";
            case ":|::|": return "4";
            case ":|:|:": return "5";
            case ":||::": return "6";
            case "|:::|": return "7";
            case "|::|:": return "8";
            case "|:|::": return "9";
            default: return "Erro" ;
        }
    }
}