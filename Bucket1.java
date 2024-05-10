//katelynn.graham@malad.us
//Katelynn Graham
// G-crafts
//Linked list assingment
//Software and Programming Dev 11B
//Mr. Gross

//importing the scanner
import java.util.Scanner;


//Creating the public class
public class Bucket1 {
    //creating the linked list items of previous, next item, and data
    private Bucket1 next;
    private Bucket1 previous;
    private Object data;

    //creating the linked list data, next item, and previous item for inputs
    public Bucket1(Object data){
        this.data=data;
        this.next=null;
        this.previous=null;
    }

     //Getting and Setting the next item
     public Bucket1 getNext(){
        return next;
    }
    public void setNext(Bucket1 addNewItem){
        this.next = addNewItem;
    }


    //Getting and Setting the previous item
    public Bucket1 getPrevious(){
        return  previous;
    }
    public void setPrevious(Bucket1 previous){
        this.previous = previous;
    }

 //Getting and setting the data that will be what is shown in the linked list
 public Object getData() {
    return data;
}

public void setData(Object data) {
    this.data = data;
}

   

    //creating the main driver method
    public static void main(String[] args) {
        //adding a scanner, head, and tail to the linked list
        Scanner scan = new Scanner (System.in);
        Bucket1 head = null;
        Bucket1 tail = null;

        //printing out a statement that tells the user to input the items here and then telling them to typed the command "done" once they are finished inputting items
        System.out.println(" Please enter items here (type 'done' to stop adding items): ");


        //creating a boolean for the inputted items
        while (true){
            String inputString = scan.nextLine();
            //creating a command for "done" as told to type in the printed line above
            if (inputString.equalsIgnoreCase("done")) {
                break;
            }
            //Adding new items to the linked list from the user input
            Bucket1 addNewItem = new Bucket1 (inputString);
            if (head == null) {
                head=addNewItem;
                tail=addNewItem;
            } else {
                addNewItem.setPrevious(tail);
                tail.setNext(addNewItem);
                tail=addNewItem;
            }
        }

        scan.close();

        //Printing out the items from the first one to the last one or from "head to tail"
        System.out.println("Printing data from front to back:");
        Bucket1 inputted = head;
        while (inputted != null) {
            System.out.println(inputted.getData());
            inputted = inputted.getNext();
        }

         // Printing data from tail to head
         System.out.println("\nPrinting data from tail to head: ");
         inputted = tail;
         while (inputted != null) {
             System.out.println(inputted.getData());
             inputted = inputted.getPrevious();
         }
    }
}