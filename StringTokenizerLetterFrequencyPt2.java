import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class StringTokenizerLetterFrequencyPt2 {

    public static void main(String[] args) {
        try{
            FileWriter fWriter = new FileWriter ("information.txt");
            BufferedWriter buffWriter = new BufferedWriter (fWriter);

            Scanner scanner = new Scanner(System.in);


            System.out.print(" Please enter first name here: ");
            String firstName = scanner.nextLine();

            System.out.print(" Please enter last name here: ");
            String lastName = scanner.nextLine();

            System.out.print(" Please enter address here: ");
            String address = scanner.nextLine();

            System.out.print(" Please enter city and state name here: ");
            String cityState = scanner.nextLine();

            System.out.print(" Please enter city zip code here: ");
            String cityZipCode = scanner.nextLine();
            int foo1 = Integer.parseInt(cityZipCode);

            System.out.print(" Please enter phone number here: ");
            String phoneNumber =  scanner.nextLine();
            int foo2 = Integer.parseInt(phoneNumber);

            fWriter.write(firstName);
            buffWriter.newLine(); 
            fWriter.write(lastName);
            buffWriter.newLine(); //Making it so it's not all on the same line
            fWriter.write(address);
            buffWriter.newLine();
            fWriter.write(cityState);
            fWriter.write(cityZipCode);
            buffWriter.newLine(); 
            fWriter.write(phoneNumber);

            scanner.close();
            buffWriter.close();
            fWriter.close();


        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private String phoneNumber;
    private String cityZipCode;{

int foo1;
try {

    foo1 = Integer.parseInt(cityZipCode);
}
catch (NumberFormatException e) {
    foo1 = 0;



int foo2;
try{
    foo2 = Integer.parseInt(phoneNumber);
}
catch (NumberFormatException w){
        foo2 = 0;
            }

        }

    }
}
