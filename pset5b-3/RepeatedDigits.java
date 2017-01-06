import java.util.Scanner;
import java.util.Arrays;
class RepeatedDigits
{
    
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = myScanner.nextInt();
        System.out.println("Digits:\t\t O, 1, 2, 3, 4, 5, 6, 7, 8, 9");
        System.out.println("Occurences:\t" + Arrays.toString(occurrences(number)));
        
   }
public static int[] occurrences(int number){
    int x = 0;
    int index = 0;
    int[] occurence = new int [10];
    
    while (number > 0 ){   // the while loop while take the mod of 10 thus getting the last digit of the number
    x = number%10;
    occurence[x]++;  // and then increasing the number's index in the empty loop by one
    number = number/10; // here we get rid of the last digit that we just used
    }
return occurence;
}
    
}