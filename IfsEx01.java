import java.util.Scanner;

public class IfsEx01 {
    public static void main(String[] args) {

        /*1. A pontuação de dois jogadores é armezanada em duas variáveis, scoreA e scoreB. Assumindo que o jogador
        com a maior pontuação é o vencedor, escreva uma sequência de condicionais if/else if/else que imprime
        "A ganhou", "B ganhou" ou "Jogo empatado".*/

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a Pontuação Jogador A:");
        double scoreA = in.nextDouble();

        System.out.print("Digite a Pontuação Jogador B:");
        double scoreB = in.nextDouble();

        if (scoreA > scoreB)
        {
            System.out.println("Jogador A Ganhou!");
        }
        if (scoreA < scoreB)
        {
            System.out.println("Jogador B Ganhou!");
        }

        else if (scoreA == scoreB)
        {
            System.out.println("Empate!");
        }

    }
}
