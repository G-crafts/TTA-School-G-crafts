//katelynn.graham@malad.us
//Katelynn Graham
//G-crafts
//Part 2 of String Tokenizer: Creating and reading form a file 5x of user inputted information
//Delimiters assignment
//Software and Programming Developement 11B
// Mr. Kim Gross
// March 1, 2024

//Adding all of the used imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Pt2 of the string tokenizer creating and reading from the file 5x
public class StringTokenizerLetterFrequencyPt2 {

private static String line;
    //Creating the main driver method
    public static void main(String[] args) {
        //Creating the try method
        try{
            //Creating a file writer and buffered writer for the file named information.txt
            FileWriter fWriter = new FileWriter ("information.txt");
            BufferedWriter buffWriter = new BufferedWriter (fWriter);

            //Creating a new scanner
            Scanner scanner = new Scanner(System.in);

            //Creating a for loop that will loop the asking from information 5 times
            for (int x = 0; x<5; x++){
                //Enter first name
            System.out.print(" Please enter first name here: ");
            String firstName = scanner.nextLine();

            //Enter last name
            System.out.print(" Please enter last name here: ");
            String lastName = scanner.nextLine();

            //enter address
            System.out.print(" Please enter address here: ");
            String address = scanner.nextLine();

            //Enter city and state names
            System.out.print(" Please enter city and state name here: ");
            String cityState = scanner.nextLine();
            
            //Enter city zip code
            System.out.print(" Please enter city zip code here: ");
            String cityZipCode = scanner.nextLine();

            //Enter phone number
            System.out.print(" Please enter phone number here: ");
            String phoneNumber =  scanner.nextLine();
            
            //Writing all of the information into the file
            buffWriter.write(firstName);
            buffWriter.newLine(); 
            buffWriter.write(lastName);
            buffWriter.newLine(); //Making it so it's not all on the same line
            buffWriter.write(address);
            buffWriter.newLine();
            buffWriter.write(cityState);
            buffWriter.newLine();
            buffWriter.write(cityZipCode);
            buffWriter.newLine(); 
            buffWriter.write(phoneNumber);
            }

            //Closing the scanner, buffered writer, and filewriter
            scanner.close();
            buffWriter.close();
            fWriter.close();


            //Catching an IOException
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    //Reading from the file 5 times
    String filePath = "information.txt"; {
    try {

            //Making the scanner that will read from student.txt
            Scanner scanner = new Scanner(new File(filePath));

            // for method for reading from the file with the scanner
            for (int x = 0; x<5; x++){
                //Reads from the input information in the file 5 times
                String firstName = scanner.nextLine();
                 String lastName = scanner.nextLine();
                 String address = scanner.nextLine();
                 String cityState = scanner.nextLine();
                 String cityZipCode = scanner.nextLine();
                 String phoneNumber =  scanner.nextLine();

                 //Prints out all of the information into the file with their own lines
                 System.out.println(filePath);               
            }
            
            //Closing the scanner
            scanner.close();

            //Catching the filenotfoundexception
        } catch (FileNotFoundException e) {
            e.printStackTrace();  
        }
        }
        //Calculating the average age of the input data
            private static float averageAge() {
                //Setting the total age = to 0
                float totalAge = 0;
                //spliting age lines
                String[] ageLines = line.split(",");
                //float of the age lines
                float age = Float.parseFloat(ageLines[1].trim());
                //Total age += age
            totalAge += age;
            //calculating the average age float
            float averageAge = (float) (totalAge / 26.0);
            //Printing out the average age
            System.out.printf("Average age is %.1f%%\n", averageAge);
            System.out.println();
            //returning the average age
            return averageAge;
       }
    }