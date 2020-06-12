public class CaixaRegistradoraTeste {
    public static void main(String[] args) {
        CaixaRegistradora c1 = new CaixaRegistradora();
        c1.clear();
        c1.adicionaItem(4.00);

        System.out.println(c1.acessaTotal() + " " + c1.acessaQtdItens());

        c1.clear();
        System.out.println(c1.acessaTotal() + " " + c1.acessaQtdItens());

    }
}

//capitulo 8.5 do livro
