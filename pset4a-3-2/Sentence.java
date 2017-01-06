import java.util.Scanner;

class Sentence
{    // Scan the string and send it to the method that would return the answer
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the sentence to know its type: ");
        String s = myScanner.nextLine();
        System.out.println(sentenceType(s));
    }
    
    // We find what the end of the string is and compare it in a if/elseif
   
    public static String sentenceType (String s)
    { 
        String test = s.substring(s.length() - 1);
        String result = "Bad Ending";
        
             if (test.equals("!")) {
                result = "exclamatory";
             } else if (test.equals("?")) {
                 result = "interrogative";
             }else if(test.equals(".")) {
                 result ="declarative";
             }
      return result;
     }
}
     