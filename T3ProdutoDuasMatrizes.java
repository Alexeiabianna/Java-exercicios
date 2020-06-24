/* Esse programa cria e multiplica duas matrizes
 *
 * Nomes: Alexei Abianna; Pedro Nunes
 * Trabalho 3
 * Disciplina Fundamentos de Programação
 * Primeira parte.
 */

import java.util.Arrays;

public class T3ProdutoDuasMatrizes {
    public static void main(String[] args) {
//      Inicializa as matrizes.
        double[][] matriz1 = {{1, 2, 3},{4, 5, 6}};
        double[][] matriz2 = {{7, 8},{9, 10},{11, 12}};

//      Utiliza o método para multiplicar as matrizes.
        double[][] pm = produtoMatrizes(matriz1, matriz2);
//      Imprime o produto da multiplicação.
        System.out.println(Arrays.deepToString(pm));

    }

    /**
     * Este método executa a multiplicação de duas matrizes de mesmo tamanho de linhas e colunas.
     * @param matriz1
     * @param matriz2
     * @return Retorna o produto da multiplicação das duas matrizes em ponto flutuante.
     */

    public static double[][] produtoMatrizes(double[][] matriz1, double[][] matriz2) {
        // Compara se a matriz pode ser multiplicada
        if(matriz1[0].length != matriz2.length){
            System.out.println("Dimensões inconsistentes!");
            return null;
        }

        double[][] matrizFinal = new double[ matriz1.length ][ matriz2[0].length] ;

        // Passa por todas as colunas
        for(int i = 0; i < matriz1.length; i++){
            //Passa por todas as linhas
            for(int j = 0; j <matriz2[0].length; j++){
                double valor = 0;

                // Esse laço passa multiplica e soma os elementos para multiplicação da matriz
                for(int k = 0; k < matriz1[0].length; k++){
                    // Calcula cada elemento da matriz
                    double produto = matriz1[i][k] * matriz2[k][j];
                    valor += produto;
                }
                matrizFinal[i][j] = valor;
            }
        }

        return matrizFinal;
    }
}