public class Vetores {
    public static void main(String[] args) {
//        int[] v = new int[30];
//        v[0] = 10;
//        v[1] = -2;
//
//        for(int i = 0; i < 29; i++){
//            System.out.println("Vetor: " + v[i]);
//        }
//        System.out.println(v.length);
//
//        System.out.println(v[1]);

        int a[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};

//      3.a)
//        for (int i = 1; i < 10; i++) {
//            a[i] = a[i - 1];
//            System.out.println(a[i]);
//        }

////      3.b)
//        for (int i = 1; i > 0; i++) {
//            a[i] = a[i - 1];
//            System.out.println(a[i]);
//        }

////      3.c)
//        for (int i = 0; i < 9; i++) {
//            a[i] = a[i + 1];
//            System.out.println(a[i]);
//        }
//
////      3.d)
//        for (int i = 8; i < 10; i++) {
//            a[i] = a[i + 1];
//            System.out.println(a[i]);
//        }
//
////      3.e)
//        for (int i = 1; i < 10; i++) {
//            a[i] = a[i - 1];
//            System.out.println(a[i]);
//        }
//
//      3.f)
        for (int i = 1; i < 10; i = i +2) {
            a[i] = 0;
            System.out.println(a[i]);
        }


    }

}
