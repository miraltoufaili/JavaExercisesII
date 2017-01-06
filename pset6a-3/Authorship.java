import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
class Authorship  
{
    public static void main(String[] args) throws FileNotFoundException
    {
    int[] letters = new int [13];
    Scanner input = new Scanner(new File("RomeoAndJuliet.txt"));
    input.useDelimiter("[^a-zA-Z']");
    int countWords = 0;
  
    while (input.hasNext()) { //scans through the words and count the letters
        String word = input.next();
        word = word.replaceAll("\'", ""); //replaces ' by nothing
            if (word.length() != 0)
            { 
                if (word.length()>13)
                {
                    letters[12]++; 
                }else{ 
                    letters[word.length()-1]++;   //storing the values in the array
                     }
            countWords++; 
            }
    }
    
    
    for(int i =1; i<14; i++){
        double percentage =((double)letters[i-1]/(double)countWords)*100; // doing the percentage and printing
        if(i!=13){
        System.out.printf("Proportion of %d-letter words: %f%% (%d words)\n",i, percentage,letters[i-1] ); 
        } else {
        System.out.printf("Proportion of %d-(or more) letter words: %f%% (%d words)\n",i, percentage,letters[i-1] );
                }
    }
          //System.out.println(countWords);
          //System.out.println(Arrays.toString(letters));
   }
}

