import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um digito: ");
        int digito = in.nextInt();
        String nomeDigito;

//        if (digito == 1) { nomeDigito = "um";}
//        else if (digito == 2) { nomeDigito = "dois"; }
//        else if (digito == 3) { nomeDigito = "tres"; }
//        else if (digito == 4) { nomeDigito = "quatro"; }
//        else if (digito == 5) { nomeDigito = "cinco"; }
//        else if (digito == 6) { nomeDigito = "seis"; }
//        else if (digito == 7) { nomeDigito = "sete"; }
//        else if (digito == 8) { nomeDigito = "oito"; }
//        else if (digito == 9) { nomeDigito = "nove"; }
//        else { nomeDigito = ""; }

        switch (digito)
        {
            case 1: nomeDigito = "um"; break;
            case 2: nomeDigito = "dois"; break;
            case 3: nomeDigito = "tres"; break;
            case 4: nomeDigito = "quatro"; break;
            case 5: nomeDigito = "cinco"; break;
            case 6: nomeDigito = "seis"; break;
            case 7: nomeDigito = "sete"; break;
            case 8: nomeDigito = "oito"; break;
            case 9: nomeDigito = "nove"; break;
            default: nomeDigito = ""; break;
        }

        System.out.println("O nome do digito é " + nomeDigito);

        System.out.print("Deseja terminar a execução? s para sim e n para não ");
        char resposta = in.next().charAt(0);

        switch (resposta)
        {
            case 'S':
            case 's': System.out.println("Terminando execução..."); break;
            case 'N':
            case 'n': System.out.println("Continuando..."); break;
            default : System.out.println("Entrada inválida."); break;
        }
    }
}
