import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n1 = in.nextInt();
        System.out.println("Insira outro número: ");
        int n2 = in.nextInt();

        int sum = n1 + n2;
        int dif = n1 - n2;
        int prod = n1 * n2;
        int med = (n1 * n2) / 2;
        int res = n1 % n2;


        System.out.println("A soma entre os números é: " + sum + "\n");
        System.out.println("A diferença entre os números é: " + dif + "\n");
        System.out.println("O produto entre os números é: " + prod + "\n");
        System.out.println("A média entre os números é: " + med + "\n");
        System.out.println("O distância entre os números é: " + res + "\n");

        int local;

        if (n1 > n2)
            local = n1;
        else
            local = n2;

        System.out.println("O maior entre os números é: " + local + "\n");
        System.out.println("O menor entre os números é: " + local + "\n");

    }
}
