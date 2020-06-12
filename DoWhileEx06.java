import java.util.Scanner;

public class DoWhileEx06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s = 1;

        for (n = 0; s > 0.01; n++){
            s = 1.0 / (1 + n * n);
            x = x + s;
            System.out.println(n);
        }

//        do {
//            s = 1.0 / (1 + n * n);
//            n++;
//            x = x + s;
//        }
//        while (s > 0.01);
//        System.out.println(n);
    }
}
