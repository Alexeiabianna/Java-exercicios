public class DemostraRandom {
    public static void main(String[] args) {
//        (int) (Math.random() * 5) + 1;
//        Para números entre 0 e 1 utilizar o default Math.random()
//        Para números inteiros entre 1 e n utilizar (int) (Math.random() * 5) + 1
        int cara;

        for (int i = 0; i < 10; i++) {
            cara = (int) (Math.random() * 2) + 1;
            if (cara == 1){
                System.out.println("Cara");
            }else {
                System.out.println("Coroa");
            }
        }
    }
}
