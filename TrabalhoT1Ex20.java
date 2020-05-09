public class TrabalhoT1Ex20 {
    public static void main(String[] args) {
        String str = "Hello";
        int n = str.length();
        String mystery = str.substring(0, 1) + str.substring(n - 2, n + 1);
        System.out.println(mystery);
    }
}
