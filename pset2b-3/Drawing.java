class Drawing
{
    public static void main(String[] args)
    {
        full();
        mid();
        full();
        mid();
        bottom();
        top();
        mid();
        bottom();
        
    }
    
    public static void top()
    {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    
    public static void bottom()
    {
        System.out.println("\\         /");
        System.out.println(" \\       /");
        System.out.println("  -------");
        
    }
    
    public static void mid()
    {
       System.out.println("-\"-'-\"-'-\"-") ;
       
      
    }
    
    public static void full()
    {
        top();
        bottom();
    }
}