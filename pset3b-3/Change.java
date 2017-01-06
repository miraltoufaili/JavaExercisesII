import java.util.Scanner;

class Change
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Total number of days: ");
        final int days = myScanner.nextInt();
        System.out.println("Enter the price of the stock: ");
        int valueOld  = myScanner.nextInt();
        
            int diffOld = 0;
            int diffNew=0;
            int day=0;
            int difference = 0;
            int val1=0;
            int val2=0;
            int i = 2;
            
            
            while ( i<=days)
            {
                    System.out.println("Enter the price of the stock: ");
                    int valueNew  = myScanner.nextInt(); 
                     diffNew= Math.abs(valueNew - valueOld);
                     
                    if (diffNew>diffOld)
                    {
                        day = i-1;
                        difference = diffNew;
                        diffOld = diffNew;
                         val1 = valueOld;
                         val2= valueNew;
                    }
             valueOld=valueNew;       
             i++;
            }
                  
            System.out.println("Largest change of " + difference);
            System.out.println("  from "+ val1 +" to " + val2);
            System.out.println("  occurred between day " + "#"+ day + " and day "+ "#"+ (day+1));
             
     } 
          
}
        
     
   

