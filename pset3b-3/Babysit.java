import java.util.Scanner;

class Babysit
{ 
    public static void main(String[] args)
    { 
        
        final double early = 5.50;
        final double normal = 8.00;
        final double late = 10.00;
        double numberOfHours = 0;
        double pay = 0;
        
       // the code works by finding the amount of hours, then adding to that minutes in terms of hour ( that is dividing
       // minutes by 60) then multiplying that sum by the right pay.
       // the if statements will add the amount to the pay if they are true and they go through.
       
       
        Scanner myScanner = new Scanner(System.in);
        System.out.println("At what HOUR did the babysitter start work? ");
        double startHour = myScanner.nextDouble();
            if(startHour<6 || startHour>11){
                System.out.println("This is not a valid number");
                return;
          }
          
        System.out.println("At what MINUTE did the babysitter start work?");
         double  startMin = myScanner.nextDouble();
           if(startMin<0 || startMin>60){
               System.out.println("This is not a valid number");
                return;
             }
             
        System.out.println("At what HOUR did the babysitter finish work? ");
         double  endHour = myScanner.nextDouble();
        if(endHour>9 && endHour<12 || endHour<4 && endHour>1){
                System.out.println("This is not a valid Finishing hour");
                 return;
            }
            
        System.out.println("At what MINUTE did the babysitter finish work? ");
        double endMin = myScanner.nextDouble();
         if(startMin<0 || startMin>60){
                System.out.println("This is not a valid number");
                 return;
           }
            
           if(endHour == 12) {
               endHour=0;
           }
        
        if(startHour>6 && startHour<9){
          numberOfHours= 9 -  startHour;
          numberOfHours= numberOfHours + (startMin/60);
          pay= numberOfHours*early;
          
        } if (startHour>9 && startHour<11) {
            numberOfHours= 11-startHour;
            numberOfHours = numberOfHours + (startMin/60);
            pay= pay + numberOfHours*normal;
            
        } if (endHour>9 && endHour<12) {
            numberOfHours= 12-endHour;
            numberOfHours = numberOfHours + (endMin/60);
            pay= pay + numberOfHours*normal;
        }
        if (endHour<4) {
            numberOfHours= endHour;
            numberOfHours = numberOfHours + (endMin/60);
            pay= pay + numberOfHours*late + 3*normal;
        }
        
        System.out.println("The baby-sitter pay is: " + pay);
    }
}   
        