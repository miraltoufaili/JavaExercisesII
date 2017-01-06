//Extra Cerdit

import java.util.Scanner;
class Binomial  
{
    
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number n: ");
       int numberOfRows = scanner.nextInt();
       print(numberOfRows);
   
    
   }
   
 public static int Bionomial(int a, int b) { // recursive method
        int[][] arr = new int[a][a];
        
        if(a == b || b == 0) { return 1;
        }else{ return Bionomial(a-1, b) + Bionomial(a-1, b-1);
    }
 }
    
    
 public static void print(int n) {   //printing method that calls the recursive method
       for (int i = 0; i < n; i++) {
           for (int j = 0; j <= i; j++) {
               System.out.print(Bionomial(i, j) + " ");
           }
           System.out.println();
       }
       
   }
}
    
   