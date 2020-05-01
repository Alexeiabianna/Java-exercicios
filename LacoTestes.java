import java.util.Scanner;

public class LacoTestes {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String s;
        int i, n, cta = 0;

        System.out.printf("Informe uma string:\n");
        s = ler.nextLine();

        System.out.println();

        n = s.length(); // tamanho da string
        for (i=0; i<n; i++) {
// verifica se o i-ésimo caractere é a vogal 'a'
            if ((s.charAt(i) == 'N') || (s.charAt(i) == 'n')) {
                cta = cta + 1;
                System.out.printf("%c ---> %do. caractere 'a'\n", s.charAt(i), cta);
            }
            else System.out.printf("%c\n", s.charAt(i));
        }

    }

}