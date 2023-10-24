// katelynn.graham@malad.us
// Objects Arraylist for Software and Programming CT
// By Katelynn Graham

import java.util.ArrayList;

public class Bunny{
    // This array list creates a way to print out all bunnies using bunny5
    static ArrayList bunnylist=new ArrayList ();

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
        //Sets the bunny color
        bunnyColor = color;
    }
    public String toString(){
        String bunnyTraits;
        bunnyTraits = bunnyName+" is "+bunnyAge+" years old and is "+bunnyColor;
        return bunnyTraits;
    }



    public static void main (String[] args) {
        // first object
        Object bunny5 = new Bunny("Sammy", 2, "white");
        bunnylist.add(bunny5);
        // Second object
        bunny5 = new Bunny("Carrot", 1, "greyish");
        bunnylist.add(bunny5);
        //Third object
        bunny5 = new Bunny("Lacey", 4, "black");
        bunnylist.add(bunny5);
        //Fourth object
        bunny5 = new Bunny("Celery", 6, "red");
        //printing the arraylist
        for(int i=0; i<bunnylist.size () ;i++) {
        bunny5=bunnylist.get(i);
        System.out.println(bunny5);
        }
    }
}
