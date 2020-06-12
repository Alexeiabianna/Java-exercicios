public class EstudanteNotas {
    // Data
    private String nome;
    private double notaTotal;
    private int qtdNotas;

    // Public Interface

    public EstudanteNotas(String nomeDoAluno) {
        nome = nomeDoAluno;
        notaTotal = 0.0;
        qtdNotas = 0;
    }

    public String acessaNome() {
        return nome;
    }

    public void adicionaNota(int notaParcial) {
        notaTotal += notaParcial;
        qtdNotas++;
    }

    public double acessaNotaFinal() {
        return notaTotal;
    }
    public double acessaNotaMedia() {
        return notaTotal / qtdNotas;
    }
}
