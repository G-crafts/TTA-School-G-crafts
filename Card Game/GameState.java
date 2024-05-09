//katelynn.graham@malad.us
//G-crafts code
//For Software and Programming Dev 11 
//For Kim Gross
//May 8th, 2024
//Semester 2 final project

//Creating my imports
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.ErrorManager;

//creating the gamestate class that implemets serializable
public class GameState implements Serializable {

    
    //main driver method
    public static void main(String[] args) {
        //Creating booleans
    boolean save;
    boolean game;
    
    try{
        //creating a new scanner
        Scanner scan = new Scanner(System.in);

        //creating a breaking point in the input if the person does not answer no or yes
        System.out.println("Type the word 'done' when the question is answered: ");

        //Creating a question for the person to answer using the input
        System.out.println("Do you want to save your game data so far? Type Yes or No: ");

        //Creating a true boolean to break the code if yes, no, or done is typed into the console
         while (true){
            String inputString = scan.nextLine();
            //creating a command for "done" as told to type in the printed line above
            if (inputString.equalsIgnoreCase("done")) {
                break;
    
            }
            //if the answer is yes, it will save the game data and break the input
            if (inputString.equalsIgnoreCase("Yes")) {
                System.out.println("'Game data saved'");
                break;
        }
        //if the answer is no to saving the game, it will print out no save data and break the input
        if (inputString.equalsIgnoreCase("No")) {
            System.out.println("'No game data saved'");
            break;
        }
    }
    //catching a possible exceptionininitializererror 
}catch (ExceptionInInitializerError e){
    e.printStackTrace();
        }
    }
}
