import java.util.Scanner;

class RealEstate

{    
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the description of the apartment: ");
        String s = myScanner.nextLine();
        System.out.println(vowelLess(s));
    }


    public static String vowelLess(String s)
    {
        s= s.replaceAll("[AEIOUaeiou]", ""); // we remove the vowels by replacing them with nothing
        return s;
    }
}
