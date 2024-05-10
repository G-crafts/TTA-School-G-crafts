//Katelynn Graham
//For Software and Programming Dev 11B
//G-crafts
//katelynn.graham@malad.us
//Edits 5-10-2024

//Adding imports
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stack1 {
  // private integers
    private int ar[];
    private int top;
    private int cap;

    //the stack of books and the size
    Stack1 (int size){

        ar = new int [size];
        //capped is the size
        cap=size;
        //Top is the first book
        top = -1;
        String bk1="book1";
        String bk2="book2";
        String bk3="book3";
        String bk4="book4";


    

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

                //Asking to enter the second book to the stack
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

                //Caching IO exception
            } catch (IOException e){
                e.printStackTrace();
            }
            }
            //Pushing the int x
            public void push(int x) {
              //If the stack is full, stop the program
                if (isFull()) {
                  System.out.println("OverFlow\nProgram Terminated\n");
                  System.exit(1);
                }
            
                //Printing out that the user should insert the books
                System.out.println("Insert Books" + x);
                ar[++top] = x;
            }

            //popping it out if the stack is empty
                public int pop() {
                    if (isEmpty()) {
                      System.out.println("Stack Empty");
                      //stopping
                      System.exit(1);
                    }
                    //returning to the top of the stack
                    return ar[top--];
                  }
                
                  // Utility function to return the size of the stack
                  public int size() {
                    return top + 1;
                  }
                
                  // Check if the stack is empty
                  public Boolean isEmpty() {
                    return top == -1;
                  }
                
                  // Check if the stack is full
                  public Boolean isFull() {
                    return top == cap - 1;
                  }
                //printing the stack from top to bottom
                  public void printStack() {
                    for (int i = 0; i <= top; i++) {
                      System.out.println(ar[i]);
                    }

                }
                    public static void main(String[] args) {
                        Stack1 stack = new Stack1(4);
                        //pushing all 4 items in the new stack
                        stack.push(1);
                        stack.push(2);
                        stack.push(3);
                        stack.push(4);
                    
                        //After popping out the items, print the stack
                        stack.pop();
                        System.out.println("\nAfter popping out");
                    
                        stack.printStack();
                    
                      }
                    }
       