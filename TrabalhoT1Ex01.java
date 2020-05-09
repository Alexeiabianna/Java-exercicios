public class TrabalhoT1Ex01 {
    public static void main(String[] args) {
        int i;
        int j = 0;
        for (i = 0; i < 5; i++)
        {
            if (i % 2 == 0)
            {
                i = i + 2;
                j++;
            }
            else
            {
                i++;
                j = j + 2;
            }
            j++;
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
