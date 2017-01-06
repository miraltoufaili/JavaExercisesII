class Digits
{ 
    public static void main(String[] args)
    {
        
        // Here is the code for five digits
        
        for( int i = 10000; i<=99999; i++) {
            int num = i*4;

            
              if (num%10 == i/10000 && num%100/10 == i/1000%10 && num%1000/100 == i/100%10 && num%10000/1000 == i/10%10 &&  num/10000==i%10) {
                  System.out.println(i);
                  i = 100000; // to exit the loop
                }
        }
          
       // Here is the code for four digits
       /* for( int i = 1000; i<=9999; i++) {
            int num = i*4;
            
              if (num%10 == i/1000 && num%100/10 == i/100%10 && num%1000/100 == i/10%10 && num/1000==i%10) {
                  System.out.println(i);
                  i= 10000;
              } 
               
            }
        */ 
           
            
     }
}

