import java.util.Arrays;

/**
 * Essa programa verifica se um numero pertence a um array por meio de busca binaria.
 *
 * @author Alexei Albiana e Pedro Nuenes
 *
 */

public class T3BinarySearch{
    public static void main (String[] args){
        int[] v = new int[1000];
        for(int i = 0; i < v.length; i++){
            v[i] = i * i;
        }

        System.out.println(Arrays.toString(v));
        System.out.println();
        System.out.print("Índices dos valores encontrados: ");
        System.out.println();
        System.out.print("  " + buscaBinaria(625, v));
        System.out.print("  " + buscaBinaria(25, v));
        System.out.print("  " + buscaBinaria(64, v));
        System.out.print("  " + buscaBinaria(13, v));
        System.out.print("  " + buscaBinaria(-10, v));
        System.out.print("  " + buscaBinaria(345744, v));
        System.out.print("  " + buscaBinaria(-23441, v));
        System.out.print("  " + buscaBinaria(1001, v));
        System.out.print("  " + buscaBinaria(0, v));
        System.out.println();
    }

    /**
     * Esse metodo procura, se houver, a posição de um inteiro em um vetor
     * @param  alvo: elemento a ser procurado.
     * @param vetor: vetor em que o elemento sera procurado.
     * @return a posição no vetor, se o elemento não pertencer ao vetor ele retorna -1.
     */
    public static int buscaBinaria(int alvo, int[] vetor){
        int tamanho = vetor.length;
        int metade = 0;
        int inicio = 0;
        int fim = vetor.length -1;
        while(inicio <= fim){
            metade = (inicio + fim) / 2;

            if(vetor[metade] == alvo){
                return metade;
            }

            else if(vetor[metade] > alvo){
                fim = metade - 1;
            }

            else{
                inicio = metade + 1;
            }
        }
        return -1;
    }
}