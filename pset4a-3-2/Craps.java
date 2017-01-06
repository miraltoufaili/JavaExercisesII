class Craps
{

    public static void main(String[] args)
   {   // uses the method and keeps looping until the total is acceptable
       int total;
       do{
              total  = doRoll();
         } while (total != 4 && total != 5 && total != 6 && total != 8 && total != 9 && total != 10);
              
        System.out.printf("%d is now the established POINT.\n", total);
        
       // uses the method as well and stops when it's 7 or equals the total 
      int casino;
      do {
              casino = doRoll(); 
         } while (casino != 7 && casino != total);
          
         //if/else to find the result
         if (casino == total){
              System.out.println("YOU WIN");
          } else {
             System.out.println( "YOU LOSE");
          }
   }
   
    // method that generats and returns the sum of two random numbers. 
    // it also prints out the values of the rolls and the total
    public static int doRoll()  
    {
       int roll1 = RandomUtils.randomInt(1, 6);
       int roll2 = RandomUtils.randomInt(1, 6);
       int total = roll1 + roll2;
        
        System.out.printf("Computer rolls a %d and a %d, for a total of %d\n", roll1, roll2, total);
        
        return (total);
    }
           
}