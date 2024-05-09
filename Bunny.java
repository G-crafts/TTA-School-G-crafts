//G-crafts
// katelynn.graham@malad.us
// Objects Arraylist for Software and Programming CT
// By Katelynn Graham
//Software and Programming Dev
// Kim Gross


//Added debugging print statements added by:
//katelynn.graham@malad.us
//Added debugged areas
//Added debug boolean
//Debugged by G-crafts
//for Debugging Project
//Software and Programming Dev
//April 11, 2024
//For Kim Gross

//Added Debugging Breakpoints at Print Statements
//katelynn.graham@malad.us
//G-crafts
//Debugged by G-crafts/Katelynn Graham
//For Debugging Project Pt. 2
//Software and Programming Dev 11B
//April 18, 2024
// For Kim Gross

import java.util.ArrayList;
import java.util.IllegalFormatConversionException;

public class Bunny{
    // This array list creates a way to print out all bunnies using bunny5
 
    // Name for the bunnies
    String bunnyName;
    //Variable for bunny color
    String bunnyColor;
    // Variable for bunny age
    String bunnyAge;
        
    
    //The method for the objects
    public Bunny (String name, int age, String color) {
        //Setting the bunny name
        bunnyName = name;
        //Sets the bunny age
        bunnyAge = String.valueOf(age);
        //debugging statement for string to int for age. Should be printing out the value of the age with the string converting to an int.
        //+added breakpoint
        System.out.println(String.format("Debugging: The value of age is %s", age));

        //Sets the bunny color
        bunnyColor = color;

        // added for the value and name of the bunny for debugging. Should be printing out the format of the bunny name and has an age.
        //+added breakpoint
System.out.println(String.format("BunnyName %s has an bunnyAge %d", bunnyName, bunnyAge));
    }
    
    public String toString(){
        String bunnyTraits;
        bunnyTraits = bunnyName+" is "+bunnyAge+" years old and is "+bunnyColor;
        return bunnyTraits;
    }



    public static void main (String[] args) {
        boolean deBug = true;
        boolean deBugger = false;
        int debug1 = 1;
        

    try {    
        //creating a debugger that switches on and off
    if (deBug) {

        //Added breakpoint
        System.out.println("Debugging is off");
    }
     if (deBugger) {

        System.out.println("Debugging is on and the imporant varibles are bcd");
     }
        //some output of the debugger if it is on
        if (debug1==1){
            //+added breakpoint
    System.out.println(deBugger);
     }
    else{ 
        //+added breakpoint
        System.out.println(debug1);
   
        
    }




      // first object
      Bunny bunny1 = new Bunny("Sammy", 2, "white");
      // Second object
      Bunny bunny2 = new Bunny("Carrot", 1, "greyish");
      //Third object
      Bunny bunny3 = new Bunny("Lacey", 4, "black");
      //Fourth object
      Bunny bunny4 = new Bunny("Celery", 6, "red");
      
      //adding my second break point:
    
      //adding the printout section
      System.out.println(bunny1);
      System.out.println(bunny2);
      System.out.println(bunny3);
      System.out.println(bunny4);


//Catching the format conversion exception that may be thrown
        } catch (IllegalFormatConversionException e) {
            //+added breakpoint
            System.out.println(e.getMessage());

        }
    }
}