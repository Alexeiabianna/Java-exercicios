import java.util.Scanner;

public class VolumePiramide {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o comprimento do lado da base da pirâmide: ");
        double s = in.nextDouble();
        System.out.print("Digite a altura da pirâmide: ");
        double h = in.nextDouble();

        double v = volumePiramide(s, h);
        System.out.println("O volume total da pirâmide é: " + v);

    }

    public static double volumePiramide(double sideLength, double height)
    {
        double areaBase = sideLength * sideLength;
        return height * areaBase / 3;
    }
}
