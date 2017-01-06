import java.util.Scanner;

class Guess

{    
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("This program has you, the user,choose a number between");
        System.out.println("1 and 100. Then I, the computer, will try my best to\nguess it");
        System.out.println();
        System.out.println("If I guess a number that's SMALLER than the");
        System.out.println("secret number,respond by tryping the letter s. If I");
        System.out.println("guess a number that's BIGGER than the secret number,");
        System.out.println("respond by typing the letterb. And if I guess\nCORRECTLY, respond by typing the letter c.");
        System.out.println();
        

        int low = 1;
        int high = 100;
        int mid = ((low+high-1)/2);
        int counter = 0; 
        do {
            System.out.printf("Is is %d? (type s,b, or c): ", mid);
            String answer = myScanner.nextLine();
            
            if(answer.charAt(0) == 'b'){
                high = mid -1; 
            } else if (answer.charAt(0) =='s'){
                low = mid +1;
            } else if (answer.charAt(0) =='c'){
                counter++;
                break;
            }
            
            mid = (low+high)/2;
            counter++;   
        }
        while(low<=high);
        
       
     
           System.out.printf("I got it after making just %d guesses\n", counter);
        
    }
}
