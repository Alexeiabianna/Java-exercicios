public class MetodosIIIEx01 {
    public static void main(String[] args) {
        System.out.println(f(100));
    }

    public static int f(int a)
    {
        if (a < 0)
        {
            return -1;
        }
        int n = a;
        while (n > 0)
        {
            if (n % 2 == 0)
            {
                n = n / 2;
            }
            else if (n == 1)
            {
                return 1;
            }
            else
            {
                n = 3 * n + 1;
            }
        }
        return 0;
    }
}

// RESPOSTAS

// a) f(-1) = -1
// b) f(0)  = 0
// c) f(1) =
// d) f(2)
// e) f(10)
// f) f(100)

