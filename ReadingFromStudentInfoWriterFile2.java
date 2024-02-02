//katelynn.graham@malad.us
//KatelynnGraham
//G-crafts
// Reading from the StudentInfoWriterFile
//Software and Programming Dev 11B
// Mr. Gross

//Importing the input output classes
import java.io.*;

//Main class
//Reading from the file
public class ReadingFromStudentInfoWriterFile2 {

    public static void main (String[] args) throws Exception
    {

        FileReader filre = new FileReader(
            "student.txt");

            //declaring loop variable
        int i;
        //holds until there is no more to read
        while ((i = filre.read()) != -1)

        //printing out all of the contents int the file
        System.out.print ((char)i);
    }
}
