//katelynn.graham@malad.us
//Katelynn Graham
//Software Development 11A
//Bunny Class PT 2 Fixed

import java.util.ArrayList;
//The bunny class
public class Bunny2 {
    static ArrayList bunnylist=new ArrayList ();
    //Bunny objects and description
 public Bunny2 (String name, int age, String color) {
        //Setting the bunny name
        bunnyName = name;
        //Sets the bunny age
        bunnyAge = String.valueOf(age);
        //Sets the bunny color
        bunnyColor = color;

    }
    // Name for the bunnies
    String bunnyName;
    //Variable for bunny color
    String bunnyColor;
    // Variable for bunny age
    String bunnyAge;

    //The second assignment part with the fixes
    public static void main (String[] args) {
        // first object
        Object bunny5 = new Bunny2("Sammy", 2, "white");
        bunnylist.add(bunny5);
        // Second object
        bunny5 = new Bunny2("Carrot", 1, "greyish");
        bunnylist.add(bunny5);
        //Third object
        bunny5 = new Bunny2("Lacey", 4, "black");
        bunnylist.add(bunny5);
        //Fourth object
        bunny5 = new Bunny2("Celery", 6, "red");
        //printing the arraylist
        for(int i=0; i<bunnylist.size () ;i++) {
        bunny5=bunnylist.get(i);
        System.out.println(bunny5);
        }
    }
     public void size() {
            System.out.println("centimeters");
             }
        Bunny myBunny = new Bunny2();
        myBunny.size();
        Bunnies myBunny = new Bunnies();
        myBunny.@size(40);
    
        Bunnies2 myBunny = new Bunnies2();{
         Bunny2 = myBunny.breed("breed");
        myBunny.breed("HollandLop");
        }
}

