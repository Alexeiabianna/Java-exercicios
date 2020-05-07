import java.util.Scanner;

public class LacoAninhadoEx02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int NMAX = 5;
        final double XMAX = 10;

        for (int n = 0; n <= NMAX; n++){
            System.out.printf("%10d", n);
        }
        System.out.println();

        for (int n = 0; n <= NMAX; n++) {
            System.out.printf("%10s", "x ");
        }
        System.out.println();

        for (int x = 0; x <= XMAX; x++) {
            for ( int n = 0; n <= NMAX; n++) {
                System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }

    }
}
