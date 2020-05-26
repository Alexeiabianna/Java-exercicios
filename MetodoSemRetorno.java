// 1. Imprima uma linha que contenha o caractere - um total de n+2 vezes onde n é o tamanho da string de entrada.
// 2. Imprima o conteúdo da string delimitando-a com caracteres de exclamação à esquerda e á direita.
// 3. Imprima mais uma linha que contenha o caractere - um total de n+2 vezes.

import java.util.Scanner;
public class MetodoSemRetorno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        stringCaixa(in.next());

    }

    /**
     * Imprime uma string dentro de uma caixa.
     * @param conteudo a string a ser impressa dentro da caixa
     */
    public static void stringCaixa(String conteudo){
        int n = conteudo.length();
        if(n == 0)
        {
            return; // sai do método imediatamente.
        }
        for(int i = 0; i < n + 2; i++)
        {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("!"+ conteudo + "!");
        for(int i = 0; i < n + 2; i++)
        {
            System.out.print("-");
        }

    }
}
