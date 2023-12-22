//katelynn.graham@malad.us
//KatelynnGraham
//G-crafts
//Mr Gross
//Software and Programming Dev
//Bunny Class Inheritance
//Inherited child class

import java.util.ArrayList;

public class ShowBunny extends Bunny {

    static ArrayList bunnylist=new ArrayList ();
{
    //hair length for each show bunny
    String hairLength;
    //Species
    String bunnySpecies;
    //how many wins it has
    int showWins;
}

    //Making the method for the show bunny array
    public Bunny.ShowBunny(String, String, int){
        hairLength = bunny hair length;
        bunnySpecies = species;
        showWins = wins;
    }
    
    public static void main (String[] args) {
        //First attribute
        Object bunny5 = new Showbunny.attribute (short, Flemmishgiant, 2);
        bunnylist.add(bunny5);

        //2nd bunny's attribute
        bunny5 = new Showbunny.attribute (long, Highlandlop, 9);
        bunnylist.add(bunny5);

        //3rd bunny's attribute
        bunny5 = new Showbunny.attribute (very long, Lionhead, 16);
        bunnylist.add(bunny5);

        //printing the arraylist
        for(int i=0; i<bunnylist.size () ;i++) {
            bunny5=bunnylist.get(i);
            System.out.println(bunny5); 
        }
    }
}
