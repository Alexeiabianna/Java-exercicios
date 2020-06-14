public class TrabalhoT2Q09
{
    public static int pow(int base, int power)
    {
        int result = 1;
        for (int i = 0; i < power; i++)
        {
            result = result * base;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(pow(pow(2, 2), 2));
    }
}