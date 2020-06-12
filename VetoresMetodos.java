import java.util.Arrays;

public class VetoresMetodos {
    public static void main(String[] args) {
        double[] vetor = {2, 5, -3};
        double resultado = somatorio(vetor);
        System.out.println(resultado);

        multiplicacao(vetor, 1.5);
        System.out.println(Arrays.toString(vetor));
    }

    public static double somatorio (double[] valores) {
        double total = 0;
        for (double valor : valores) {
            total = total + valor;
        }
        return total;
    }

    public static void multiplicacao (double[] valores, double fator) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = fator * valores[i];
        }


    }
}
