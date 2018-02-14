import java.util.*;
/**
 * Write a description of class tictactoe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tictactoe
{
   /*Declaring stuff thingy*/  
    String [][] otherboard = new String[3][3];
    
   /**
     * Constructor for objects of class tictactoe
     */
    public tictactoe()
    {
        for(int r = 0; r < otherboard.length; r++){
            for(int c = 0; c < otherboard[0].length; c++){
                if(otherboard[r][c] == otherboard[r+1][c] && otherboard[r][c] == otherboard[r+2][c]|| otherboard[r][c] == otherboard[r][c+1] && otherboard[r][c] == otherboard[r][c+2] || otherboard[r][c] == otherboard[r+1][c+1] && otherboard[r][c] == otherboard[r+2][c+2]){
                    if(otherboard[r][c] == "X" && otherboard[r][c+1] == "X" && otherboard[r][c+2] == "X" || otherboard[r][c] == "X" && otherboard[r+1][c] == "X" && otherboard[r+2][c] == "X" || otherboard[r][c] == "X" && otherboard[r+1][c+1] == "X" && otherboard[r+2][c+2] == "X" || otherboard[r][c] == "O" && otherboard[r][c+1] == "O" && otherboard[r][c+2] == "O" || otherboard[r][c] == "O" && otherboard[r+1][c] == "O" && otherboard[r+2][c] == "O" || otherboard[r][c] == "O" && otherboard[r+1][c+1] == "O" && otherboard[r+2][c+2] == "O"  ){
                        
                    }
                }
            }
        }
   } 
   public void board(){
        clearboard();
        for(int t = 0; t < 4; t++){
            System.out.print(t + " " + " " + " " + " ");
        }
        System.out.println();
        for(int r = 0; r < 3; r++){
            System.out.print((r+1) + " ");
            for(int c = 0; c < 3; c++){
                System.out.print(otherboard[r][c]);
            }
            System.out.println();
        }
   }
   public void clearboard(){
        for(int t = 0; t < otherboard.length; t++){
            for (int s = 0; s < otherboard[0].length; s++){
                otherboard[t][s] = " "+ " " + " " + "[]";
            }
        }
   }
   public void p1Interaction(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("Player One enter your coordinates");
        System.out.println("Row:");
        int row = reader.nextInt();
        System.out.println("Column:");
        int col = reader.nextInt();
        otherboard[row][col] = "X";
   }
   public void p2Ineractin(){
       Scanner reader = new Scanner(System.in);
       System.out.println("Player Two enter your coordinates");
       System.out.println("Row:");
       int row = reader.nextInt();
       System.out.println("Column:");
       int col = reader.nexInt();
       otherboard[row][col] = "O";
   }
   public void players(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("How many players? 1 or 2?:  ");
        int numPlayers = reader.nextInt();
        
        if(numPlayers == 1){
            playerOneGame();
        }
        else if(numPlayers == 2){
            playerTwoGame();
        }
        else{
            System.out.println("Invalid Option made");
        }
        
   }
   public void playerOneGame(){
        
   }
   public void playerTwoGame(){
   }
}
