public class ClassesII {

    public static void main(String[] args) {
        Carro fusca = new Carro(10);

        fusca.adicionaCombustivel(48);
        fusca.dirigir(200);


        System.out.println("Nível de Combustível em litros = " + fusca.acessaNivelCombustivel());
    }

}
