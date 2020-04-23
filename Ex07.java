import java.text.NumberFormat;
import java.util.Locale;

public class Ex07 {

    public static void main(String[] args) {

        double compra = 19.93;
        double pagamento = 20.00;
        double troco = pagamento - compra;
        System.out.println(troco);

        double d = troco;

        Locale localeBR = new Locale( "pt", "BR" );
        NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
        System.out.println(dinheiroBR.format(d));

    }

}

