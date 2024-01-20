import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class scanner33 {
public static void main(String[] args) {
   try {
    Scanner scanner = new Scanner(System.in);
System.out.println(" Enter integer here: ");
int userInt=scanner.nextInt();
System.out.print(userInt);

   
   System.out.print(" Enter float here: "); 
   Scanner Scanner;
Float userFloat = scanner.nextFloat();
System.out.print(userFloat);

System.out.print(" Enter line of text here: ");
String userLine = scanner.nextLine();
System.out.println(userLine);


System.out.println(" Enter full name here: ");
String fullNameLine=scanner.nextLine();



String[] names = fullNameLine.split("\\s");

if (names.length >= 2) {

String firstName = names[0];

String lastName = names[1];
String.join(" ", Arrays.copyOfRange(names, 0+1, names.length)); 
} 
   } finally {}  
} 
}