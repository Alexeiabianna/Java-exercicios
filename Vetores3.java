import java.util.Arrays;
import java.util.Scanner;

public class Vetores3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        // Caso 1: Onde o tamanhpo do vetro é conhecido
//        final int TAMANHO = 5;
//        double[] vetor = new double[TAMANHO];
//        System.out.print("Por favor, digite 5 números: ");
//        for(int i = 0; i < vetor.length; i++) {
//            vetor[i] = in.nextDouble();
//        }

//        // Caso 2.1: A quantidade de entradas é desconhecida.
//        double[] vetor1 = new double[100];
//
//        int tamanhoAtual = 0;
//        System.out.println("Por favor digite valores numéricos: ");
//        while(in.hasNextDouble() && tamanhoAtual < vetor1.length) {
//            vetor1[tamanhoAtual] = in.nextDouble();
//            tamanhoAtual++;
//        }
//        // Imprime o vetor
//        for(int i = 0; i < tamanhoAtual; i++) {
//            System.out.print(vetor1[i] + " ");
//        }

        final int TAMANHO_INICIAL = 2;
        double[] vetor = new double[TAMANHO_INICIAL];
        int tamanhoAtual = 0;
        while(in.hasNextDouble()) {
            // Cria uma cópia do vetor com o dobro do tamanho.
            if (tamanhoAtual >= vetor.length) {
                vetor = Arrays.copyOf(vetor, 2 * vetor.length);
            }
            vetor[tamanhoAtual] = in.nextDouble();
            tamanhoAtual++;
        }
        // Cria um novo vetor apenas com os valores digitados.
        vetor = Arrays.copyOf(vetor, tamanhoAtual);

        System.out.println(Arrays.toString(vetor));
        System.out.println(vetor.length);
    }
}
