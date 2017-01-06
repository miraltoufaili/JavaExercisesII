import java.util.Scanner;
class Roman {

        
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the Roman number you wish to convert: ");
        String s = myScanner.nextLine();
        System.out.println("Answer: " + convert(s));
    }
    
    // we'll convert the s to upper case so we dont get any errors
    // then we'll go through each char and sent it to the calculate method where it gets replaced by it's value
      public static int convert(String s)
    {
        int number = 0;
        String upperS = s.toUpperCase(); 
        
        for (int i = 0; i < upperS.length() - 1; i++)
        {
            if (calculate(upperS.charAt(i)) < calculate(upperS.charAt(i + 1))) {
                number -= calculate(upperS.charAt(i));
            } else {
                number += calculate(upperS.charAt(i));
            }
        }
        number += calculate(upperS.charAt(upperS.length() - 1));
        return number;
    }


   // converts the letters to nubmers 
    public static int calculate (char letter)
    {
        if (letter == 'M') {
                return 1000;
        } if (letter == 'D') {
                return 500;
        } if (letter == 'C') {
                return 100;
        } if (letter == 'L') {
                return 50;
        } if (letter == 'X') {
                return 10; 
        } if (letter == 'V') {
            return 5;
        } if (letter == 'I') {
              return 1;
        } 
          return 0;
    }
}   


