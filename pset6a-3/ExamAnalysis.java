// Ahmet Karadeniz
import java.util.Scanner;
import java.io.*;
import java.util.*;

class ExamAnalysis
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Welcom to Exam Analysis. Let's begin ...");
        System.out.println("Please type the correct answers to the exma questions, one right after the other: ");
        String RightAns = keyboard.nextLine();  //ABCEDBACED
        System.out.println();
        System.out.println("What is the name of the file containing each students's responses to the 10 questions?");
        String fileName = keyboard.nextLine();
        System.out.println();

        File f = new File (fileName);
        Scanner s = new Scanner (new File(fileName));
        char [][] studentAnswers = new char [500][100]; //array that can take the max values
        int counter = 0; //counts how many lines there is ie how many students 
         
        while(s.hasNextLine()) //reads through the file and stories the values in an array
        {
            String a = s.nextLine();
            System.out.printf("Student #%d's responses: %s \n", (counter+1), a);
            if(a.length() == 0){
              for(int j=0;j<RightAns.length();j++){
                studentAnswers[counter][j] = ' '; 
            }
            } else {
            for(int j=0;j<RightAns.length();j++){
                studentAnswers[counter][j] = a.charAt(j);
            }
            }
            counter++;
        } 
        
        System.out.println("We have reached end of file!\n");
        System.out.println("Thank you for the data on 9 students. Here's the analysis:\n");
        System.out.println("Students # \t Correct \t Incorrect \t Blank \t ");
        System.out.println("~~~~~~~~~ \t  ~~~~~~~ \t ~~~~~~~~~ \t ~~~~~");
        
        for( int i = 0; i<counter; i++) 
        {
            checkingAnswers(i, studentAnswers, RightAns);   
        }
        

        System.out.println();
        System.out.println("QUESTION ANALYSIS    (*marks the correct response");
        System.out.println("~~~~~~~~~~~~~~~~ \n");
         
         for(int i=0; i<RightAns.length(); i++){
                     String[] abcde = { "A", "B", "C", "D", "E", "Blank"};
             int[] count = new int [6]; 
             int sum=0;
                     
                     for(int j = 0; j < 5;j++){ //Check which is the right answer 
                         char check= abcde[j].charAt(0);
                         if(RightAns.charAt(i) == check){
                         abcde[j] = "" + RightAns.charAt(i) + "*"; 
                         }
                     }
                     
                    for(int k=0; k<counter; k++){    //checks how the students did on each question
                          if (studentAnswers[k][i] == 'A'){
                          count[0]++;
                        }else if (studentAnswers[k][i] == 'B'){
                            count[1]++;
                        }else if (studentAnswers[k][i] == 'C'){
                            count[2]++;
                        }else if (studentAnswers[k][i] == 'D'){
                            count[3]++;
                        } else if (studentAnswers[k][i] == 'E'){
                            count[4]++;
                        } else if (studentAnswers[k][i] == ' '){
                            count[5]++;
                        }
         sum = count[0] + count [1] + count [2] + count [3] + count [4] + count [5];
        
         
        }System.out.printf("Question # %d: \n", i+1 );
        for(int m = 0; m < 6 ; m++) System.out.print(abcde[m]+ "\t");
        System.out.println();
        for(int n = 0; n < 6 ; n++) System.out.print(count[n]+ "\t");
        System.out.println();
        for(int p = 0; p < 6 ; p++) System.out.printf("%.1f%% \t", (1.0*count[p]/(1.0*sum)*100));
        System.out.println();
        System.out.println();
             
         }
       
        
    }
    
        public static void checkingAnswers(int studentNumber, char[][] studentAnswers, String RightAns)
        {
            int correct = 0;
            int blank = 0;
            int incorrect = 0;
                for (int i = 0; i<RightAns.length(); i++){ //checks the answers of the student 
                    if (studentAnswers[studentNumber][i] == RightAns.charAt(i)){
                        correct++;  
                    }else if (studentAnswers[studentNumber][i] == ' '){
                        blank++;
                    }else if (studentAnswers[studentNumber][i] != RightAns.charAt(i) && studentAnswers[studentNumber][i] != ' '){
                        incorrect++;
                    }
                } 
            System.out.printf("%d \t\t   %d \t\t  %d \t\t  %d\n", studentNumber+1,correct,incorrect, blank);
        }
     
     
}
    

    