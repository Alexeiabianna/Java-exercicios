public class MetodoCube {
    public static void main(String[] args) {
        System.out.println(volumeCube(10));


        System.out.println(volumeCube(5));
    }

    public static double volumeCube(double tamanhoLado) {
        double resultado = Math.pow(tamanhoLado, 3);
        return resultado;
    }

}

