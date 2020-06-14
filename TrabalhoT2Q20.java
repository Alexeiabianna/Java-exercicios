import java.util.Arrays;

public class TrabalhoT2Q20 {
    public static void main(String[] args) {
        double[] values = new double[10];

        for(double element : values){
            element = 5;
            System.out.println(element);
            System.out.println(Arrays.toString(values));
        }
    }
}
