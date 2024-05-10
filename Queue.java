//katelynn.graham@malad.us
//Katelynn Graham
//G-crafts
//For Software and Programming Dev 11B
//Queues and Stacks assignment 
//Edits 5-10-24



// Queue implementation in Java
// Adding all imports
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Queue<n> {
    //size of queue
    int size = 4;
    //items + new int is the size
    int items[] = new int[size];
    //The front and the rear or books 1-4
    int front, rear;
        String bk1="book1";
        String bk2="book2";
        String bk3="book3";
        String bk4="book4";{


    

            try {

            //creating a filewriter to write in the new file called userinputdata.txt
            FileWriter fWriter = new FileWriter("userinputstack.txt");
            
            //Creating a BufferWriter to write the characters into the file and the new lines
            BufferedWriter buffWriter = new BufferedWriter(fWriter);

            // Creating a new scanner 
            Scanner scan = new Scanner(System.in);

            //Asking to enter the first book
            System.out.print (" Enter first book here: ");
                String firstBook = scan.nextLine();

                //Asking to enter the secpnd book to the stack
                System.out.print (" Enter second book here: ");
                String secondBook = scan.nextLine();

                //Asking to enter the third book to the stack
                System.out.print (" Enter third book here: ");
                String thirdBook = scan.nextLine();

                //Asking to enter the last book
                System.out.print (" Enter last book here: ");
                String lastBook = scan.nextLine();


                buffWriter.write(firstBook);
                buffWriter.newLine(); 
                buffWriter.write(secondBook);
                buffWriter.newLine(); //Making it so it's not all on the same line
                buffWriter.write(thirdBook);
                buffWriter.newLine();
                buffWriter.write(lastBook);
                buffWriter.newLine(); 

           
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        //Creating the top and bottom of the queue from the stack
            private 
        Queue(){
        front = -1;
        rear = -1;
        }
        //if the stack is full
        boolean isFull() {
            //If the front is 0 and rear = to size -1
        if (front == 0 && rear == size - 1) {
            //return if true
            return true;
        }
        //return if false
        return false;
        }
    
        //If the stack is empty, the front has none
        boolean isEmpty() {
        if (front == -1)
        //Return true
            return true;
        else
        //otherwise is false
            return false;
        }
    
        //void enqueue int is element
        void enQueue(int element) {
            //If the queue is full, print "Queue is full"
        if (isFull()) {
            System.out.println("Queue is full");
            //If not front, the the front has none and the back adds
        } else {
            if (front == -1)
            front = 0;
            rear++;
            //the rear of the items
            items[rear] = element;
            //adding the books plus the elements
            System.out.println("Insert Books " + element);
        }
        }
    
        int deQueue() {
        int element;
        //int element in empty stack returns -1
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            // otherwise the elements is the items in front
            element = items[front];
            // if the front is greater than the rear, then the front and rear -1
            if (front >= rear) {
            front = -1;
            rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            //Otherwise the front has more
            else {
            front++;
            }

        }
        //Returning the element int
        return element;
        }  
    
        //Main driver method
        public static void main(String[] args) {
            //creating a queue named que
        Queue que = new Queue();
    
        // deQueue is not possible on empty queue
        que.deQueue();
    
        // enQueue 4 elements
        que.enQueue(1);
        que.enQueue(2);
        que.enQueue(3);
        que.enQueue(4);
    
        // 6th element can't be added to because the queue is full
        que.enQueue(6);
            }
    }