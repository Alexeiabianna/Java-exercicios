import  java.lang.Math;
import java.util.Scanner;

/** 8. Escreva um programa que lê um número do usuário e imprime o quadrado, o cubo e o número na quarta potência.
Use o método Math.pow apenas para calcular a quarta potência.*/

public class Ex08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = in.nextDouble();
        double q = n * n;
        double c = n * n * n;
        double qq = Math.pow(n,4);

        System.out.print("O quadrado de " + n + " é: " + q + "\n");
        System.out.print("O cubo de " + n + " é: " + c + "\n" );
        System.out.print("A quarta potência de " + n + " é: " + qq);

    }
}
