public class VetoresII {
    public static void main(String[] args) {
        // Margem de erro.
        final double EPSILON = 1E-14;
        double r = Math.sqrt(2.0);
        System.out.println(r);
        double m = r * r;
        System.out.println(m);

        if(Math.abs(r*r - 2.0) < EPSILON){
            System.out.println("iguais");
        }
    }
}
