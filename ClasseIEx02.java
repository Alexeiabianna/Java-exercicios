public class ClasseIEx02 {
    public static void main(String[] args) {

        ContadorModerno count = new ContadorModerno();
        int n = 10;

        for(int i = 0; i < n; i++) {
            count.conta();
        }
        String p = count.getValor();
        System.out.println(p);
    }
}
