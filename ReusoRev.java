import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ReusoRev {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {3, 5, 6};

        duplicaVetor(v1);
        duplicaVetor(v2);
        duplicaVetor(v1);
        duplicaVetor(v1);

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

//        System.out.println(Arrays.toString(v1));
//
//        for(int i = 0; i < v1.length; i++) {
//            v1[i] = v1[i] * 2;
//        }
//        System.out.println(Arrays.toString(v1));

    }

    public static void duplicaVetor(int[] v1) {
        for(int i = 0; i < v1.length; i++) {
            v1[i] = v1[i] * 2;
        }
    }
}
