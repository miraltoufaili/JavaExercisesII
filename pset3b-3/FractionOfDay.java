class FractionOfDay
{
    public static void main(String[] args)
    {
        
    String n1 = "Time";
    String n2 = "Fraction Since Midnight";
    
    System.out.printf("%5s         %14s\n", n1, n2 );
 
    System.out.printf("%2d:00 AM     %-7.4f\n" ,12, fractionOfDay( 0,  0, 0, 'A')); 

      for(int i=1; i<12; i++){
             System.out.printf("%2d:00 AM     %-7.4f\n" ,i, fractionOfDay( i,  0, 0, 'A')); }
            
    System.out.printf("%2d:00 PM     %-7.4f\n" ,12, fractionOfDay( 12,  0, 0, 'A')); 
 
        for(int i=12; i<24; i++){
             System.out.printf("%2d:00 PM     %-7.4f\n" ,(i-12), fractionOfDay( i,  0, 0, 'P'));}
            
     }

        public static double fractionOfDay(int hour, int minute, int sec, char HD)
        { 
           
            double sum= hour*3600 + minute*60 + sec;
               sum=sum/(24*3600);  
               
               return sum;
            } 
 }

            
            
        