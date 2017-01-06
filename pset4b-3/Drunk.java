import java.util.Scanner;

class Drunk

{    
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the number of trips ");
        
        final int N = myScanner.nextInt();
        int i=0;
        int sum=0;
        
     while (i<=N) { 
        sum += drunkWalk(); 
        i++;
        }
        
        double average = sum/N;
        
        System.out.printf("Average # of blocks equals %.1f\n", average);
        
    }
    
    public static int drunkWalk()
    {
        
    int counter = 0; // counts the blocks
    String place = "home";
    int i = 6; // starting street
     
        while (i!=1 && i!=11) {
            double x = Math.random();
            if(x<0.5){
                i++;
                counter++;
            } else {
                i--;
                counter++;
            }
        }
        
        
      if (i==1){
          place = "jail";
      }
    
     System.out.printf("Here we go again... time for a walk!\nWalked %d blocks, and\nLanded at %s\n\n", counter,place);
     return counter;
        }
}