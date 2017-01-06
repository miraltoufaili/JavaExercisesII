// Miral Toufaili
import java.util.Scanner;
class TicTacToe {
    
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome! Tic-Tac-Tow is a two player game. ");
        System.out.println("Enter player one's name: ");
        String player1 = myScanner.nextLine();
        System.out.println("Enter player two's name: ");
        String player2 = myScanner.nextLine();
         
        System.out.println("Player take turns marking a square. Only squares\n"
        + "not already marked can be pipcked. Once a player has marked three sqaures in a row he or she wins!"
        + "If all squares\nare marked and no three squares are the same, a tied game is\n"
        + "declared. Have Fun!");
        

        TicTacToeBoard Board = new TicTacToeBoard();
        int move = 0;
        boolean turn = true; // if true then playerOne
        char c;
        
        while (move < 9) { // keeps looping until the max number of plays 
            
            System.out.println("Pick a row between 1 and 3: ");
            int row = myScanner.nextInt();
            System.out.println("Pick a colomn between 1 and 3: ");
            int col = myScanner.nextInt();
            row --; // we are entering 1 - 3 but the index of arrays is between 0-2
            col--; 
            
            if (turn){ // knows who's turn it is
                c = 'X';
            }else{
                c = 'O';
            }
            
        
           if(Board.makeMove(row,col,c)){ 
                 System.out.println(Board); 
                        if (c == 'X') {         // checks if someone has won by sending it to the class method isWin
                            if (Board.isWin()) {
                               System.out.printf("Game Over %s Wins!!!", player1);
                               break; // if someone wins, then the loop breaks 
                            }
                        }
                        
                        if (c == 'O') {
                            if (Board.isWin()) {
                               System.out.printf("Game Over %s Wins!!!", player2);
                               break;
                            }
                        }
           move++;  // after each players turn, number of moves increases - this is while's condition
           turn = !turn; // changes the turn of the players 
           
        } else {
            System.out.println("ILLEGAL CHOICE! TRY AGAIN...");
        }
        }

    }
}