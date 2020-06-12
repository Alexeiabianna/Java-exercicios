public class MetodosIIIEx06 {
    public static void main(String[] args) {
        ehPrimo(2);
        System.out.println();
    }

    public static boolean ehPrimo(int n){
        int countDivisor = 0;
        for(int d = 1; d <= n; d++){
            if(n % d == 0){
                countDivisor++;
            }
        }

        boolean result;
        if(countDivisor == 2){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
