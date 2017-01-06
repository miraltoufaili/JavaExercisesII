class RecursiveSum
{
    public static void main(String[] args)
    {
        System.out.println(sumTo(2));
    }
    
    public static double sumTo(int n)
    {   
        if (n == 0) { return 0;}
        else if (n < 0) { throw new IllegalArgumentException("n must be positive");}
        else { return 1.0/n + sumTo(n-1) ; }
    }
}