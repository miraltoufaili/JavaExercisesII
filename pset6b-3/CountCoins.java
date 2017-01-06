// undergrad credit

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CountCoins
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File ("Coins.txt");
        Scanner s = new Scanner(file);
        System.out.printf("Total money = $%.2f\n ", countCoins(s));
       
    }
    
    public static double countCoins(Scanner s) throws FileNotFoundException
    {
        double centCount = 0; 
        while (s.hasNextInt())
        {
            int number = s.nextInt();
            String coin = s.next().toLowerCase();
            if(coin.equals("pennies")){
                centCount += (number*1);
            } else if (coin.equals("nickels")) {
                centCount += (number*5);
            } else if (coin.equals("dimes")) {
                centCount += (number*10);
            } else if (coin.equals("quarters")) {
                centCount += (number*25);
            } 
        }
        
     double answer = centCount/100.0; 
     return answer;
    } 
}