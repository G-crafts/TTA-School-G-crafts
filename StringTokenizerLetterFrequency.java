//katelynn.graham@malad.us
// KatelynnGraham
// Software and Programming Dev 11B
// String Manipulation 2 Assignment
// String Tokenizer Assignment
// Mr Gross
// February 16, 2024

//All of the imports used
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//Creating the StringTokenizerLetterFrequency class
public class StringTokenizerLetterFrequency {

    //Creating the main driver method
    public static void main(String[] args) {
        //Creating the filepath as the letter.txt file to read from
        String filePath = "letter.txt";

        //Creating variables to store the total frequency and total percentage of the file
        int totalFrequency = 0;
        float totalPercentage = 0;

        //Creating the buffered reader and file reader for the filepath letter.txt
        try (BufferedReader buffReader = new BufferedReader(new FileReader(filePath))) {

            //Reading the lines + skipping header
            buffReader.readLine();

            //Create string line
            String line; 

            //Reading all lines of the file
            while ((line = buffReader.readLine()) != null){

                //Splitting the lines into different lines with a comma
                String[] allLines = line.split(",");
                // Print statement for troubleshooting:  System.out.println(Arrays.toString(allLines));
                String letterLines = allLines[0].trim();
                //line readers for floats and integers in all of the lines
                int frequency = Integer.parseInt(allLines[1].trim());
                float percentage = Float.parseFloat(allLines[2].trim());

                //Adding the percentage to the total percentage
                totalPercentage += percentage;
                totalFrequency += frequency;

                // Printing out the letter data in formatted print of letterLine, frequency, and percentage
                System.out.printf("%s\b Frequency: %d\b Percentage: %.1f%%\n", letterLines, frequency, percentage);

            }

            //Calculating the average frequency
            float averageFrequency = (float) (totalFrequency / 26.0);

            //Printing out the line totals
            System.out.println("\n Totals: ");
            //Percentage line totals
            System.out.printf("Percentage Total: %.1f%%\n", totalPercentage);
            //Frequency line totals
            System.out.println("Frequency Total: " + totalFrequency);
            System.out.printf("Average frequency is %.1f%%\n", averageFrequency);

            //Catching the possible IO exception
        }catch (IOException e){
            //print out the error
                System.out.println(e.getMessage());
            }
        }
    }