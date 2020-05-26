import java.util.Scanner;

public class MetodosSemRetornoEx01_04 {
    public static void main(String[] args) {
        // 1. System.out.print(stringCaixa("Ola")); O erro é o método sem retorno ser chamado como um metodo com retorno
        // 2. Consrua um método que adiciona 3 exclamações na string de entrada.
        // 3.Como modificar o método stringCaixa para que ele
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        exclamar(in.next());
        stringCaixa(in.next());
    }

    /**
     * Este método adiciona a string de entrada exclamação tripla.
     * @param exclamacao
     */
    public static void exclamar(String exclamacao){
            System.out.print(exclamacao + "!!!");
    }

    /**
     * Este método adiciona espaços entre a exclamação e a palavra dentro da caixa.
     * @param conteudo
     */
    public static void stringCaixa(String conteudo){
        int n = conteudo.length();
        for(int i = 0; i < n + 4; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("! " + conteudo + " !" );
        for(int i = 0; i < n + 4; i++){
            System.out.print("-");
        }
    }
}
