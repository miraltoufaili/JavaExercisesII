import java.util.Scanner;

class Congress
{ 
    public static void main(String[] args)
    { 
        Scanner myScanner = new Scanner(System.in);
        System.out.println("In order to see if you are eligible for House or Senate please enter the following: \nYour age: ");
        int age = myScanner.nextInt();
        System.out.println("You length of citizenship: ");
        int citizenship = myScanner.nextInt();
        
        System.out.println("For House: " + eligibleForHouse(age,citizenship));
        System.out.println("For Senate: " + eligibleForSenate(age,citizenship));
        
    }
    
    public static boolean eligibleForHouse(int age, int citizenship)
    {
       return( age >=25 && citizenship >= 7);
    }
    
    
    
    
    
    public static boolean eligibleForSenate(int age, int citizenship)
    {
        return (age >= 35 && citizenship >=9);
    }
}