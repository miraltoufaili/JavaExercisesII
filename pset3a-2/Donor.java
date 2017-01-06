import java.util.Scanner;

class Donor

{ 
    public static void main(String[] args)
    {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the amount of a contribution: ");
        double amount = myScanner.nextDouble();
    
          System.out.println(donor(amount));
    }
        
        public static String donor(double amount)
        {
            
        String answer = "Error: amount entered is less than zero!";
        
        if ( amount >= 10000.00) {
           answer = "Benefactors";
        } else if ( amount < 10000.00 && amount >= 1000.0) {
            answer =  "Patrons";
        } else if ( amount< 1000.0 && amount >= 200.00){
            answer = "Supporters";
        } else if (amount <200.00 && amount>= 15.00){
           answer = "Friends";
        } else if (amount < 15.00 && amount >= 0.00){
          answer =  "Cheapskater";
        } 
        
            return answer;
        
        
    }
}