//katelynn.graham@malad.us
//Katelynn Graham
//Word String Breakdown assignment for String Manipulation Week 4
//Software and Programming Dev 11B
//Mr. Gross
//February 8, 2024

//Importing the scanner
import java.util.Scanner;

//Creating the class
public class StringWordBreakDown {
    //Creating the main driver method
    public static void main (String [] args) {
        //Here is the hard-coded string that Mr Gross provided
        String testString="the quick Brown Fox Jumped over the lazy dog";

        //Converting all of the words to lower case
        String toLowerCase=("the quick Brown Fox Jumped over the lazy dog");

        //Creating the printed out hard coded words
        int numberOfHardCodedWords = printedWords(testString);
        // Printing the hard coded words into single word strings
        System.out.println ( " Let's break down the hard coded words into single words ");
        //Printing out the total number of words in the hard coded string
        System.out.println ( " Total Number of Words in the Hard Coded String: " + numberOfHardCodedWords);

        //Creating a scanner
        Scanner scan = new Scanner(System.in);
        //Adding a line of text that the user inputs
        System.out.println ("\nEnter a line of text here: ");
        //Scanning the next line of user input
        String usersInput = scan.nextLine();

        //Printing out "breaking down the users input"
        System.out.println (" Let's break down the users input here: ");
        //The number of userinputted words = the printed words from the users input
        int numberOfUserInputtedWords = printedWords(usersInput);
        //Printing out the total number of words in the string as the number of user inputted words
        System.out.println ("Total Number if Words in the String" + numberOfUserInputtedWords);


        //Closing the scanner
        scan.close();
    }
    //Creating a printed words chunk withthe splitting method for the input string
    private static int printedWords(String inputString){
        //Splitting the string into separate words
        String[] words = inputString.split("\\s+");

        // for method
        for (String word : words);
        //Printing the words into seprate lines
        System.out.println (words);
    }

    private Object words;

     {
//returning the word lengths
    return words.length;

}
}
