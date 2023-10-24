// katelynn.graham@malad.us
// Objects Arraylist for Software and Programming CT
// By Katelynn Graham

import java.util.ArrayList;

public class Bunny1{
    // This array list creates a way to print out all bunnies using bunny5
    
    //The method for the objects
    public Bunny1 (String name, int age, String color) {
        //Setting the bunny name
        bunnyName = name;
        //Sets the bunny age
        bunnyAge = String.valueOf(age);
        //Sets the bunny color
        bunnyColor = color;
    }
    //First fixes with deletions
    public String toString(){
        String bunnyTraits;
        bunnyTraits = bunnyName+" is "+bunnyAge+" years old and is "+bunnyColor;
        return bunnyTraits;
    }

}
