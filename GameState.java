import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class GameState implements Serializable {
    private int playerScore;
    private String userName;
    public static void main(String[] args) {
        
    
    try{

    //creating a filewriter to write in the new file called userinputdata.txt
    FileWriter fWriter = new FileWriter("userinputgame.txt");
    
    //Creating a BufferWriter to write the characters into the file and the new lines
    BufferedWriter buffWriter = new BufferedWriter(fWriter);

    // Creating a new scanner 
    Scanner scanner = new Scanner(System.in);

    for (int x = 0; x<4; x++){

        //Prompt for user name
    System.out.print (" Enter user name here: ");
        String userName = scanner.nextLine();

        //Prompt for the player number
        System.out.print (" Enter player number here (player 1, player 2, player 3, or player 4): ");
        String playerNum = scanner.nextLine();

        //Prompt for the number of games that they have played
        System.out.print (" Enter the number of games played (out of four) so far here : ");
        String gamesPlayed = scanner.nextLine();

        //prompt for the number of games won by the player so far out of 4
        System.out.print (" Enter number of games won  so far here : ");
        String playerWins = scanner.nextLine();

        //Prompt for the number of cards that they have 
        System.out.print (" Enter the number of cards you have currently here : ");
        String numberofCurrentCards = scanner.nextLine();

        //enter the names and numbers of the cards you currently have
        System.out.print (" Enter the cards you have currently here : ");
        String currentCards = scanner.nextLine();


        //Writing the user name, player num, and player wins, and number of games that have been played that was entered into the file
        buffWriter.write(userName);
        buffWriter.newLine(); 
        buffWriter.write(playerNum);
        buffWriter.newLine(); //Making it so it's not all on the same line
        buffWriter.write(gamesPlayed);
        buffWriter.newLine(); 
        buffWriter.write(playerWins);
        buffWriter.newLine();
        buffWriter.write(numberofCurrentCards);
        buffWriter.newLine();
        buffWriter.write(currentCards);
        buffWriter.newLine();
    }

    //Closing the scanner, bufferedwriter, and filewriter
    scanner.close();
    buffWriter.close();
    fWriter.close();

    //Catching an IOException called e for this block of code
} catch (IOException e){
    e.printStackTrace();
}
}

}
