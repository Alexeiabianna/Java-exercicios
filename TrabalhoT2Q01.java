public class TrabalhoT2Q01
{
    public static void main(String[] args)
    {
        for (int i = 0;  i < 4;  i++)
        {
            System.out.print(myFun(i) +  " ");
        }
    }
    public static int myFun(int perfect)
    {
        return ((perfect - 1) * (perfect - 1));
    }
}