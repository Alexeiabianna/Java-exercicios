import java.util.Scanner;

public class OperadorCondicional {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int andar = 14;
        int andarReal;

        System.out.println("Andar real: " + (andar > 13 ? andar - 1 : andar));


    }
}
