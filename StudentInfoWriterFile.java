   //katelynn.graham@malad.us
   //KatelynnGraham
   //G-crafts
   //Student Information File Writer Assignment
   //Software and Programming Dev 11B
   // Mr. Gross
// importing scanner, BufferWriter, FileWriter, and IOException
    import java.io.BufferedWriter;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.Scanner;
    
    //Creating the class
    public class StudentInfoWriterFile {
        //Creating the main driver method
        public static void main(String[] args) {
            //Using the try method to try the block
            try{
                //Creating a FileWriter with the given file name
                FileWriter fWriter = new FileWriter("student.txt");

                //Creating a BufferWriter to write the characters into the file and the new lines
                BufferedWriter buffWriter = new BufferedWriter(fWriter);

                //Creating the scanner object
                Scanner scanner = new Scanner(System.in);

                //Asking to enter the first name
                System.out.print (" Enter first name here: ");
                String firstName = scanner.nextLine();

                //Asking to enter the last name
                System.out.print (" Enter last name here: ");
                String lastName = scanner.nextLine();

                //Asking to enter the name of the grade being either Freshman, Sophomore, Junior, or Senior
                System.out.print (" Enter grade name here (Freshman, Sophomore, Junior, Senior): ");
                String yearName = scanner.nextLine();

                //Asking to enter the name of the school you attend
                System.out.print (" Enter name of your school here: ");
                String schoolName = scanner.nextLine();


                //Writing the first name, last name, year name, and the school name into the file
                fWriter.write(firstName);
                buffWriter.newLine(); 
                fWriter.write(lastName);
                buffWriter.newLine(); //Making it so it's not all on the same line
                fWriter.write(yearName);
                buffWriter.newLine();
                fWriter.write(schoolName);


                //Closing the bufferwriter, the filewriter, and the scanner
                buffWriter.close();
                fWriter.close();
                scanner.close();

                //Catching the possible exception and printing it out
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
}
