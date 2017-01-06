import java.util.Scanner;
import java.util.Arrays;

class Vowels
{    
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the sentence to count the vowels: ");
        String s = myScanner.nextLine();
        System.out.println(Arrays.toString(vowelCount(s)));
    }



public static int[] vowelCount(String s)
{ int[] arr = new int [5];
  char c ; 
  String upperS = s.toUpperCase();
  
  for(int i = 0; i< upperS.length() - 1; i++){
      c = upperS.charAt(i);  
      if (c == 'A'){
          arr[0] ++;
      } else if (c == 'E'){
          arr[1] ++;
      } else if (c == 'I'){
          arr[2] ++;
      } else if (c == 'O'){
          arr[3] ++;
      } else if (c == 'U'){
          arr[4]++;
      }
  }

    return arr;
}

}