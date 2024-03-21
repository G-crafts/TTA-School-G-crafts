// Queue implementation in Java

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Queue<n> {
    int size = 4;
    int items[] = new int[size];
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

            private 
        Queue(){
        front = -1;
        rear = -1;
        }
        
        boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
        }
    
        boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
        }
    
        void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
            front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Insert Books " + element);
        }
        }
    
        int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
            front = -1;
            rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
            front++;
            }

        }
        return element;
        }  
    
        public static void main(String[] args) {
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