import java.util.Scanner;

public class StringCaixa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Digite uma palavra: ");
        s = in.next();

        stringCaixa(s);
    }
    /**
     * Imprime uma string dentro de uma caixa.
     * @param content a string a ser impressa dentro da caixa.
     */
    public static void stringCaixa(String content)
    {
        int n = content.length();
        for(int i = 0; i < n + 2; i++)
        {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("!" + content + "!");
        for(int i =0; i < n + 2; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
}
