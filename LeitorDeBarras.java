/*
 * Esse programa le um codigo de barras e devolve o codigo postal
 *
 * Pedro Nunes e Alexei Abianna
 */
import java.util.Scanner;
public class LeitorDeBarras{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("insira o codigo de baras");
        String codigoBarras = in.next();
        transformaBarra(codigoBarras);
    }

    /**
     * esse metodo imprime um numero de um respectivo codigo de barras
     * @parm codigoBarra eh o codigo de barras
     */
    public static void transformaBarra(String codigoBarra){
        if(codigoBarra.length() == 32){  // verifica se tem o numero correto de barras 

            String zipCode = "";
            for(int i = 1; i <= 25; i += 5){ // pega o valor numerico do codigo de barras
                zipCode += digitoDaBarra(codigoBarra.substring(i, (i + 5)));
            }

            int checkDigit = 0;
            if(zipCode.length() == 5){ // Verifica se todos os caracteres são barras
                for(int i = 0; i <= 4; i++){        // Calcula o digito de verificação
                    checkDigit += Character.getNumericValue(zipCode.charAt(i));
                }

                if(checkDigit % 10 == 0 ) {       // Testa um caso especial do digito de verificação
                    checkDigit = 0;
                }
                else{
                    checkDigit = 10 - (checkDigit % 10);
                }

                // pega o valor numerico do digito de verificação dado pelo usuario
                int verifica = Character.getNumericValue(digitoDaBarra(codigoBarra.substring(26, 31)).charAt(0));

                if(checkDigit == verifica){     // Verifica o digito de verificação
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
     * Esse metodo atribui um numero a cada 5 barras
     * @Parm codBarra é a barra que sera transformada em numero
     * @return é o numero obtido
     */
    public static String digitoDaBarra(String codBarra){
        switch (codBarra) {  // atribui um numero a cada 5 barras
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