import java.util.Scanner;

/**
 Este programa imprime o preço por onça de um pack de 6 latinha.
 Use vírgulas para as entradas caso você tenha problemas Exception in thread "main" java.util.InputMismatchException.
 */

public class Volume2 {

    public static void main(String[] args)
    {
        // Lê o preço por pack.

        Scanner in = new Scanner(System.in);

        System.out.print("Por favor, entre com o preço de um pack de latinhas: ");
        double precoPack = in.nextDouble();

        // Lê o volume por latinha

        System.out.print("Por favor, entre com o volume de cada lata em litros: ");
        double volumeLata = in.nextDouble();

        // Calcula o volume do pack

        final double LATAS_POR_PACK = 6;
        double volumePack = volumeLata * LATAS_POR_PACK;

        // Calcula e imprime na tela o preço por litro

        double precoPorLitro = precoPack / volumePack;

        System.out.printf("Preço por litro: %8.2f", precoPorLitro);
        System.out.println();
    }
}
