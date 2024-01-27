//katelynn.graham@malad.us
//KatelynnGraham
//G-crafts
//Software and Programming Dev 11B
// Mr Gross

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class scanner33 {
public static void main(String[] args) {

    //Creating the try statement
   try {
    //creating a scanner object and a new scanner
    Scanner scanner = new Scanner(System.in);
    //printing out integer "enter integer here"
System.out.println(" Enter integer here: ");
int userInt=scanner.nextInt();
//printing out the integer the user input
System.out.print(userInt);


   //creating a "enter float here" statement
   System.out.print(" Enter float here: "); 
   //creating the scanner for the float
   Scanner Scanner;
   //creating the user float and scanner of the next float
Float userFloat = scanner.nextFloat();
//printing out the float the user unput
System.out.print(userFloat);

//creating an "enter line of text here" statement
System.out.print(" Enter line of text here: ");
//creating the user line and scanner of the next line
String userLine = scanner.nextLine();
//printing out the line of text entered by the user
System.out.println(userLine);


//Creating an "enter full name" statement
System.out.println(" Enter full name here: ");
//creating a string where the user puts the full name
String fullNameLine=scanner.nextLine();


//Creating the split of the full name
String[] names = fullNameLine.split("\\s");
//creating an if statement if the full name is less than or equal to 2
if (names.length >= 2) {
//First name
String firstName = names[0];
//Last name
String lastName = names[1];
//Joining the two
String.join(" ", Arrays.copyOfRange(names, 0+1, names.length)); 
} 
   } finally {}  
   //Breaking the program
 //  System.out.println("Hello Mr./Mrs." lastName " or can I call you" firstName "?");
} 
}