import java.util.Scanner;

public class LoopControl {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double salary = 0;
        System.out.print("Enter salaries, -1 to finish: ");
        Scanner in = new Scanner(System.in);
// Process data until the sentinel is entered
        while (salary != -1) {
            salary = in.nextDouble();
            if (salary != -1) {
                System.out.println("Ok");
            }
        }
    }
}
