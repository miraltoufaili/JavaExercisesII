import java.util.Scanner;

class Divisors
{ 
    public static void main(String[] args)
    { 
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input an integer value for m: ");
        int min = myScanner.nextInt();
        System.out.println("Now input an integer value for n that is greater than or equal to " + min + ": ");
        int max = myScanner.nextInt();
        
        for(int i=min; i<=max; i++){
            int sum = 0;
            
            for(int j=1; j<i ; j++){
                if(i%j == 0){
                sum+=j;}
            }
                
                if (sum<i){
                    System.out.println(i + " is deficient");
                } else if (sum == i){
                    System.out.println(i + " is perfect");
                } else if (sum > i){
                    System.out.println(i + " is abundant");
                }
            }
            
            
            
        }
    
    
}