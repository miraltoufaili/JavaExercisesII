import java.util.Scanner;

class PowersOf2
{ 
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 62: ");
        int num = myScanner.nextInt();
        
        if (num >=0 && num<=62) {
            
        max(num);
        System.out.println();
        
        } else {
          System.out.println("Number entered is not between 0 and 62, please try agian.");
        }
      }
          public static void max(int num)
         {
             System.out.print("1");
             long sum=1;
             for(int i=1; i<=num ;i++){
             sum=sum*2;
            System.out.print("\t" + sum);
            
             }
         }
  }