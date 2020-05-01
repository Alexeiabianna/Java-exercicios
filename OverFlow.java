public class OverFlow {
    public static void main(String[] args) {

                int menor = Integer.MIN_VALUE;

                System.out.printf("\nMenor inteiro: %d", menor);
                System.out.printf("\nMenor inteiro - 1: %d", menor-1);
                System.out.printf("\nMenor inteiro - 100: %d\n", menor-100);

                int maior = Integer.MAX_VALUE;

                System.out.printf("\nMaior inteiro: %d", maior);
                System.out.printf("\nMaior inteiro + 1: %d", maior + 1);
                System.out.printf("\nMaior inteiro + 100: %d\n", maior + 100);
    }
}
