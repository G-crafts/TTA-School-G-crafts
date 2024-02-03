//katelynn.graham@malad.us
//KatelynnGraham
//G-crafts
// Reading from the StudentInfoWriterFile
//Software and Programming Dev 11B
// Mr. Gross
//February 2, 2024

//Adding the imports for the file, the filenotfoundexception, and the scanner
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Creating the filereader for student.txt file which comes from the StudentInfoWriterFile
public class ReadingFromStudInfWriterFile {
    
    //The main driver method
    public static void main(String[] args) {

        //Creating the filepath string to the student.txt file
        String filePathString = "student.txt";

        //Trying to read the data from the file
        try {

            //Making the scanner that will read from student.txt
            Scanner scanner = new Scanner(new File(filePathString));

            // While method for reading from the file with the scanner
            while (scanner.hasNextLine()) {

                //Reading from each line in the file
                String studentInformationString = scanner.nextLine();
                //Printing out each line of the file until there are no more lines of text
                System.out.print(studentInformationString);
            }
            
            //Closing the scanner
            scanner.close();

            //Catching the filenotfoundexception
        } catch (FileNotFoundException e) {
            e.printStackTrace();  
        }
}
}