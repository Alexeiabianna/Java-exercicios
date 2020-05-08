public class LacoAninhadoEx06 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                int m = j * i;
                System.out.printf("%5s", m);
            }
            System.out.println();
        }
    }
}
