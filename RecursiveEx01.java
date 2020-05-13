public class RecursiveEx01 {
    public static void main(String[] args) {
        printTriangle(4);
//        printTriangle2(4);
    }

//    Conceitos de Matemática Discreta

    public static void printTriangle(int sideLength) {
//      imprime uma linha com n-1 pares de []
        if (sideLength < 1) { return; } // base da recursão (onde as chamadas recursivas devem parar)
        printTriangle(sideLength -1);

        // imprime a linha com n pares de []
        for (int i = 0; i < sideLength; i++){
            System.out.print("[]");
        }
        System.out.println();
    }

//    public static void printTriangle2(int sideLength) {
//        for (int i = 0; i < sideLength; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("[]");
//            }
//            System.out.println();
//        }
//    }
}
