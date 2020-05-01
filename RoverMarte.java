// Nome: Alexei Abianna

import java.util.Scanner;

public class RoverMarte {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("###  Rover Marte ###");

//      Definindo ponto inicial

        System.out.print("Digite a coordenada no eixo x: ");
        if (in.hasNextInt()) {
            x = in.nextInt();
            System.out.print("Digite a coordenada no eixo y: ");
            y = in.nextInt();
            System.out.println("Posição inicial: " + x + ", " + y + "\n");

        } else {
            System.out.println("Erro: Digite um valor válido!");
        }


//      Movimentação do Rover
//
//      Input sequencia

        Scanner ler = new Scanner(System.in);

        String s;
        int i, n = 0;

        System.out.print("Digite a sequência de comandos: ");
        s = ler.nextLine();

        System.out.println();

        n = s.length(); // tamanho da string

        for (i = 0; i < n; i++) {
//          Verifica a direção e adiciona um as coordenadas x,y
            if ((s.charAt(i) == 'N') || (s.charAt(i) == 'n')) {
                y++;
                System.out.print("Movendo Rover para o norte...\n");
            }
            else if ((s.charAt(i) == 'S') || (s.charAt(i) == 's')) {
                y--;
                System.out.print("Movendo Rover para o sul...\n");
            }
            else if ((s.charAt(i) == 'O') || (s.charAt(i) == 'o')) {
                x--;
                System.out.print("Movendo Rover para o oeste...\n");
            }
            else if ((s.charAt(i) == 'L') || (s.charAt(i) == 'l')) {
                x++;
                System.out.print("Movendo Rover para o leste...\n");
            }
            else System.out.printf("Direção inválida %c\n", s.charAt(i));
        }

//        Resultado da posição final

        System.out.println("A posição final do Rover é: " + "(" + x + "," + y + ")");

        }
}







