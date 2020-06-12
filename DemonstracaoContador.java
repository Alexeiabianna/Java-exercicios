/**
 * Esta classe é uma desmonstração do uso da classe Contador
 */
public class DemonstracaoContador {
    public static void main(String[] args)
    {
        Contador cont = new Contador();
        cont.conta();
        cont.conta();
        int resultado = cont.getValor();
        System.out.println("Valor do contador: " + resultado);
        cont.conta();
        cont.conta();
        resultado = cont.getValor();
        System.out.println("Valor do contador: " + resultado);

    }
}
