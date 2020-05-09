import java.util.Scanner;

public class TrabaloT1Ex08 {
    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        i = in.nextInt();
        if (i > 25)
        {
            i++;
        }
        else
        {
            i--;
        }
        System.out.print(i);
    }
}
