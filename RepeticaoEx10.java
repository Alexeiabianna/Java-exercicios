public class RepeticaoEx10 {
    public static void main(String[] args) {
        //Fazer entrada de dados pelo Scanner
        int n = 7;
        int div = 0;

        for (int aux = 1; aux <= n; aux++)
        {
            if (n % aux == 0)
            {
                div++;
            }
//            System.out.println(aux);
        }
        if (div == 2)
        {
            System.out.println(n + " é primo.");
        }
        else {
            System.out.println("Este número não é primo.");
        }

    }
}
