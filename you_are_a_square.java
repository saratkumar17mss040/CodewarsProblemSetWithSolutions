public class Square 
{    
    public static boolean isSquare(long n)
    {
        boolean checker = false;
        for(long i=0;i<=n;i++)
        {
            if(n == i*i)
                checker = true;
        }
        return checker;
    }
}
