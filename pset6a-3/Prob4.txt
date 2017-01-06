class Prob4
{
    public static void main(String[] args)
    {
        printTriangle(4);
    }
    
    
    public static void printTriangle (int s)  {
        if (s < 1) return;
        for (int i = 0; i < s; i++)
        {
            System.out.print( "[]");
        }
        System.out.println ();
        printTriangle (s-1);
       
        }
    
}
