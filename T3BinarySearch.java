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

        System.out.println("O vetor tem os quadrados de 0 ate 999 de forma crescente.");
        System.out.println();
        System.out.print("Índices dos valores encontrados: ");
        System.out.println();
        System.out.println("Alvo 625 posição: " + buscaBinaria(625, v));
        System.out.println("Alvo 25 posição: " + buscaBinaria(25, v));
        System.out.println("Alvo 65 posição: " + buscaBinaria(64, v));
        System.out.println("Alvo 13 posição: " + buscaBinaria(13, v));
        System.out.println("Alvo -10 posição: " + buscaBinaria(-10, v));
        System.out.println("Alvo 345744 posição: " + buscaBinaria(345744, v));
        System.out.println("Alvo -23441 posição: " + buscaBinaria(-23441, v));
        System.out.println("Alvo 1001 posição: " + buscaBinaria(1001, v));
        System.out.println("Alvo 0 posição: " + buscaBinaria(0, v));
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
