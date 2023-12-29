//katelynn.graham@malad.us
//CTE Software and Programming Semester 1
//Interface project 1
//December 29, 2023
//Mr. Gross

import java.util.ArrayList;
import java.util.Collections;

public class HorseWrapper {
    //creating the running method
public static void main (String[]args){

    //creating 10 new horses with the age and name as the parameters
    Horse horse1 = new Horse ("Chick", 4);
    Horse horse2 = new Horse ("Bob", 3);
    Horse horse3 = new Horse ("Mr. Ed", 12);
    Horse horse4 = new Horse ("Cake", 5);
    Horse horse5 = new Horse ("Dolly", 7);
    Horse horse6 = new Horse ("Copper", 14);
    Horse horse7 = new Horse ("Danny", 8);
    Horse horse8 = new Horse ("Diamond", 23);
    Horse horse9 = new Horse ("Fluffy", 30);
    Horse horse10 = new Horse ("Babe", 24);
    //creating the horse arraylist as horselist
    ArrayList<Horse> horseList = new ArrayList<Horse>();
    //adding horses 1-10 to the arraylist
    horseList.add(horse1);
    horseList.add(horse2);
    horseList.add(horse3);
    horseList.add(horse4);
    horseList.add(horse5);
    horseList.add(horse6);
    horseList.add(horse7);
    horseList.add(horse8);
    horseList.add(horse9);
    horseList.add(horse10);
    //printing out the unsorted list up to the 10th horse
    System.out.println("This is our unsorted list");
    for (int x=0; x<horseList.size();x++){
        System.out.println(horseList.get(x));        
    }
    //sorting the horse list from youngest to oldest
    Collections.sort(horseList);
    //printing a blank like to beautify the code
    System.out.println("");
    //printing out the sorted list up to the 10th horse (the entirety of the list)
    System.out.println("This is our sorted list");
    for (int x=0; x<horseList.size();x++){
        System.out.println(horseList.get(x));        
    }
}
}
