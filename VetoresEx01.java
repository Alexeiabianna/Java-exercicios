import java.util.Arrays;

public class VetoresEx01 {
    public static void main(String[] args) {
        double[] v1 = {1, 3, 4, 5, 6, 8};
        boolean achou = pertence(5, v1);
        if(achou){
            System.out.println("o elemento foi encontrado.");
        }
        else {
            System.out.println("o elemento não foi encontrado.");
        }

    }
    public static boolean pertence(double elemento, double[] vetor)
    {
        boolean achou = false;
        for(double valor: vetor){
            if(valor == elemento){
                achou = true;
            }
        }
        return false;
    }

    public static boolean mesmoTamanho(double[] vetor1, double[] vetor2)
    {
        return vetor1.length == vetor2.length;
    }

    public static boolean iguais(double[] vetor1, double[] vetor2)
    {
        boolean iguais = false;
        if(vetor1.length != vetor2.length){
            iguais =  false;
        }
        for(int i = 0; i < vetor1.length; i++){
            if(vetor1[i] != vetor2[i]) {
                return false;
            }
        }
        return true;
    }
}
