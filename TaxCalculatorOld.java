import java.util.Scanner;
/**
 This program computes income taxes, using a simplified tax schedule.
 */
public class TaxCalculatorOld
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua renda anual: ");
        double renda = in.nextDouble();
        double tax = 0.00;
        double pay = 0.00;

        if (renda <= 50000)
        {
            tax = 0.01;
        }
        else if (renda > 50000 && renda < 75000)
        {
            tax = 0.02;
        }
        else if (renda > 75000 && renda < 100000)
        {
            tax = 0.03;
        }
        else if (renda > 100000 && renda < 250000)
        {
            tax = 0.04;
        }
        else if (renda > 250000 && renda < 500000)
        {
            tax = 0.05;
        }
        else if (renda > 50000)
        {
            tax = 0.06;
        }

        double total = tax * renda;
        System.out.println("O valor do imposto para esta renda será de: " + total);

    }
}