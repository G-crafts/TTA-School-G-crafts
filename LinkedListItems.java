//katelynn.graham@malad.us
//Katelynn Graham
// G-crafts
//Linked list assingment
//Software and Programming Dev 11B
//Mr. Gross

//importing the scanner
import java.util.Scanner;


//Creating the public class
public class LinkedListItems {
    //creating the linked list items of previous, next item, and data
    private LinkedListItems nextIt;
    private LinkedListItems previous;
    private Object data;

    //creating the linked list data, next item, and previous item for inputs
    public LinkedListItems(Object data){
        this.data=data;
        this.nextIt=null;
        this.previous=null;
    }

     //Getting and Setting the next item
     public LinkedListItems getNextIt(){
        return nextIt;
    }
    public void setNextIt(LinkedListItems addNewItem){
        this.nextIt = nextIt;
    }


    //Getting and Setting the previous item
    public LinkedListItems getPrevious(){
        return  previous;
    }
    public void setPrevious(LinkedListItems previous){
        this.previous = previous;
    }

 //Getting and setting the data that will be what is shown in the linked list
    public LinkedListItems getData(){
        return getData();
    }
    public void setData(Object data){
        this.data=data;
    }

   

    //creatomg the main driver method
    public static void main(String[] args) {
        //adding a scanner, head, and tail to the linked list
        Scanner scan = new Scanner (System.in);
        LinkedListItems head = null;
        LinkedListItems tail = null;

        //printing out a statement that tells the user to input the items here and then telling them to typed the command "done" once they are finished inputting items
        System.out.println(" Please enter items here (type 'done' to stop adding items): ");


        //creating a boolean for the inputted items
        while (true){
            String inputtedString = scan.nextLine();
            //creating a command for "done" as told to type in the printed line above
            if (inputtedString.equalsIgnoreCase("done")) {
                break;
            }
            //Adding new items to the linked list from the user input
            LinkedListItems addNewItem = new LinkedListItems (inputtedString);
            if (head == null) {
                head=addNewItem;
                tail=addNewItem;
            } else {
                addNewItem.setPrevious(tail);
                tail.setNextIt(addNewItem);
                tail=addNewItem;
            }
        }

        scan.close();

        //Printing out the items from the first one to the last one or from "head to tail"
        System.out.println(" Printing data from head to tail: ");
        LinkedListItems currentIt = head;
        while (currentIt != null) {
            System.out.println(currentIt.getData());
            currentIt = currentIt.getNextIt();
        }
    }
}