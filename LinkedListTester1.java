//katelynn.graham@malad.us
//Katelynn Graham
// G-crafts
//Linked list assingment
//Software and Programming Dev 11B
//Mr. Gross

//importing the scanner
import java.util.Scanner;


//Creating the public class
public class LinkedListTester1 {
    //creating the linked list items of previous, next item, and data
    private LinkedListTester1 nextIt;
    private LinkedListTester1 previous;
    private Object data;

    //creating the linked list data, next item, and previous item for inputs
    public LinkedListTester1(Object data){
        this.data=data;
        this.nextIt=null;
        this.previous=null;
    }

     //Getting and Setting the next item
     public LinkedListTester1 getNextIt(){
        return nextIt;
    }
    public void setNextIt(LinkedListTester1 addNewItem){
        this.nextIt = nextIt;
    }


    //Getting and Setting the previous item
    public LinkedListTester1 getPrevious(){
        return  previous;
    }
    public void setPrevious(LinkedListTester1 tail){
        this.previous = previous;
    }

 //Getting and setting the data that will be what is shown in the linked list
    public LinkedListTester1 getData(){
        return getData();
    }
    public void setData(Object data){
        this.data=data;
    }

   

    //creatomg the main driver method
    public static void main(String[] args) {
        //adding a scanner, head, and tail to the linked list
        Scanner scan = new Scanner (System.in);
        LinkedListTester1 head = null;
        LinkedListTester1 tail = null;

        //printing out a statement that tells the user to input the items here and then telling them to typed the command "done" once they are finished inputting items
        System.out.println(" Please enter items here (type done to stop adding items): ");


        //creating a boolean for the inputted items
        while (true){
            String inputtedString = scan.nextLine();
            //creating a command for "done" as told to type in the printed line above
            if (inputtedString.equalsIgnoreCase("done")) {
                break;
            }
            //Adding new items to the linked list from the user input
            LinkedListTester1 addNewItem = new LinkedListTester1 (inputtedString);
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
        LinkedListTester1 currentIt = head;
        while (currentIt != null) {
            System.out.println(currentIt.getData());
            currentIt = currentIt.getNextIt();
        }
    }
}