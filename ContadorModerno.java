/**
 * Esta classe modela um contador moderno.
 */
public class ContadorModerno
{
    private String asteriscos = "";

    /**
     * Este método incrementa o contador em uma unidade.
     */
    public void conta()
    {
        asteriscos = asteriscos + "*";
    }

    /**
     * Devolve o número da contagem em asteriscos
     */
    public String getValor()
    {
        return asteriscos;
    }

    /**
     * Desfaz a última contagem.
     */
    public void desfazer()
    {

    }
}
