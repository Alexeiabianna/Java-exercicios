public class ClassesIEx04 {
    public static void main(String[] args) {
        Contador count = new Contador();
        int n = 101;

        count.ajustaLimite(100);

        for(int i = 0; i < n; i++){
            count.conta();
        }
        int p = count.getValor();
        System.out.println(p);
    }
}