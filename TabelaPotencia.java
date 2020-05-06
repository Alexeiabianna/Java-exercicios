import java.util.Scanner;

public class TabelaPotencia {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int NMAX = 4;
        final double XMAX = 10;

        for (int n = 1; n <= NMAX; n++){
            System.out.printf("%10d", n);
        }
        System.out.println();

        for (int n = 1; n <= NMAX; n++) {
            System.out.printf("%10s", "x ");
        }
        System.out.println();

        for (int x = 1; x<= XMAX; x++) {
            for ( int n = 1; n <= NMAX; n++) {
                System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }

    }
}
// Primeiro: Imprimir cabeçalho
// Segundo: Para x de 1 até 10 (laço for):
//      imprime uma linha
//      imprime uma quebra de linha
// Terceiro: quebrar o imprime uma linha em mais pedaços  - Para n de 1 até 4 imprime x^n
//