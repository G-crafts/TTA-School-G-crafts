

public class Bunny2 {
    static ArrayList bunnylist=new ArrayList ();

    // Name for the bunnies
    String bunnyName;
    //Variable for bunny color
    String bunnyColor;
    // Variable for bunny age
    String bunnyAge;

    public static void main (String[] args) {
        // first object
        Object bunny5 = new Bunny1("Sammy", 2, "white");
        bunnylist.add(bunny5);
        // Second object
        bunny5 = new Bunny1("Carrot", 1, "greyish");
        bunnylist.add(bunny5);
        //Third object
        bunny5 = new Bunny1("Lacey", 4, "black");
        bunnylist.add(bunny5);
        //Fourth object
        bunny5 = new Bunny1("Celery", 6, "red");
        //printing the arraylist
        for(int i=0; i<bunnylist.size () ;i++) {
        bunny5=bunnylist.get(i);
        System.out.println(bunny5);
        }
    }

    
}
