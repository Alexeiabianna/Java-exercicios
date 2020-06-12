// Contador com método reinicializa.

public class ClassesIEx01 {
    public static void main(String[] args) {

        int n = 10;
        Contador count = new Contador();
        // Zera o contador.
        count.reinicializa();

        for(int i = 0; i < n; i++){
            count.conta();
        }
        // Desfaz o último clique.
        count.desfazer();
        // Imprime a contagem.
        int valor = count.getValor();
        System.out.println(valor);

    }
}
