import java.util.Arrays;

public class Vetores4 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 9, 0};
        for(int v:v1){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(v1, 7);
        System.out.println("Encontrei o valor na posição " + p);
    }
}
