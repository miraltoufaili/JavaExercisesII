// Reema AlDous

class TicTacToeBoard
{
    private char[][] board = { 
        {' ', ' ' ,' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '} };
    
    
public TicTacToeBoard(){
}

public String toString(){ // building the String that would print 
    String S = "";
    for (int i = 0; i < 3; i++) {
        S = S + "|";
            for (int j = 0; j < 3; j++) {
                if (board[i][j] ==  ' ') {
                    S = S + " ";
                }else{
                    S = S + board[i][j];
                }
            }
        S = S + "|";
        S = S + "\n";
    }
    return S;
}


 public boolean makeMove(int row, int col, char c){
        
        Boolean legal = false;
            if ((row < 0) || (row > 3) || (col < 0) || (col > 3)) { // checking range
                return legal ;              
            }else if (board[row][col] != ' '){  //checking if empty 
                return legal; 
            }else{
                board[row][col] = c; //if both of the above conditions pass then change to the board is made
                return !legal ;  
            }
 }    
       
 

public boolean isWin(){ // if goes through all the possibilities of winning and returns a boolean is one is true
    
    if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' ') ||
        (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' ') ||
        (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' ') ||
        
        (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
        (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ') ||
        (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' ') ||
        
        (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' ') ||
        (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
        return true;
     }else { 
         return false;
     }
}
}