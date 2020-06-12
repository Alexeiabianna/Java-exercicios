public class EstudanteTester {
    public static void main(String[] args) {
        EstudanteNotas e1 = new EstudanteNotas("Frodo");
        e1.adicionaNota(5);
        e1.adicionaNota(9);
        e1.adicionaNota(7);
        e1.adicionaNota(8);

        System.out.println("O estudante "+ e1.acessaNome() + " teve nota total "+ e1.acessaNotaFinal() +
                " e a nota média "+ e1.acessaNotaMedia());

    }
}
