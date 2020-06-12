// Métodos de instância - estão associados a um objeto
// Métodos de classe - estão associados a uma classe. (static)

import java.util.Scanner;

// Adicionar o preço de um item
// Desenvolver o total da compra e a quantidade de intens
// Reinicializar o caixa para uma nova compra

/**
 * Esta classe simula o comportamento de uma caixa registradora simples que
 * controla o preço total da compra e quantidade de itens
 */

public class CaixaRegistradora
{
//    Dados
    private int qtdItens;
    private double precoTotal;

    /**
     * Adiciona o preço de um item ao total atual da compra.
     * @param preco o preço do item a ser adicionado.
     */
    public void adicionaItem(double preco) {
//        Método de acesso
        qtdItens++;
        precoTotal = precoTotal + preco;
    }

    /**
     * Devolve o preço total da compra.
     * @return o preço total.
     */
    public double acessaTotal() {
//        Método de acesso
        return precoTotal;
    }

    /**
     * Retorna a quantidade de itens adicionados.
     * @return
     */
    public int acessaQtdItens() {
//        Método de acesso
        return qtdItens;
    }

    /**
     *
     */
    public void clear() {
        qtdItens = 0;
        precoTotal = 0;

    }

}
