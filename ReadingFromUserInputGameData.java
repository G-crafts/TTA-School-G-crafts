import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class ReadingFromUserInputGameData {
    public static void main(String[] args) {
        
    
    String filePath2 = "userinputgame.txt";
    
    //Trying to read the data from the file
    try {

        //Making the scanner that will read from student.txt
        Scanner scanner = new Scanner(new File(filePath2));

        // While method for reading from the file with the scanner
        while (scanner.hasNextLine()) {

            //Reading from each line in the file
            String cardGameUserInputGameData = scanner.nextLine();
            //Printing out each line of the file until there are no more lines of text
            System.out.print(cardGameUserInputGameData);
        }
    scanner.close();
    
    }catch (FileNotFoundException f) {
        f.printStackTrace();  
        }
    }
}