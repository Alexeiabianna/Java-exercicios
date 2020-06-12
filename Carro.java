public class Carro {
    // Dados (Artibutos)
    private double qtdCombustivel;
    private double consumoMedio;
    private double consumoReal;

    // Iterface Pública
    public Carro(double eficiencia) {
        qtdCombustivel = 0.0;
        consumoMedio = eficiencia;
    }

    public void dirigir(double distancia) {
        double consumo = distancia / consumoMedio;
        if(consumo >= qtdCombustivel) {
            qtdCombustivel = 0.0;
        }
        else {
            qtdCombustivel = qtdCombustivel - consumo;
        }
    }

    public double acessaNivelCombustivel() {
        return qtdCombustivel;
    }

    public void adicionaCombustivel(double combustivel) {
        qtdCombustivel += combustivel;
    }

}