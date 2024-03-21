import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stack1 {
    private int ar[];
    private int top;
    private int cap;


    Stack1 (int size){

        ar = new int [size];
        cap=size;
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
            public void push(int x) {
                if (isFull()) {
                  System.out.println("OverFlow\nProgram Terminated\n");
                  System.exit(1);
                }
            
                System.out.println("Insert Books" + x);
                ar[++top] = x;
            }


                public int pop() {
                    if (isEmpty()) {
                      System.out.println("Stack Empty");
                      System.exit(1);
                    }
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
                
                  public void printStack() {
                    for (int i = 0; i <= top; i++) {
                      System.out.println(ar[i]);
                    }

                }
                    public static void main(String[] args) {
                        Stack1 stack = new Stack1(4);
                    
                        stack.push(1);
                        stack.push(2);
                        stack.push(3);
                        stack.push(4);
                    
                        stack.pop();
                        System.out.println("\nAfter popping out");
                    
                        stack.printStack();
                    
                      }
                    }
       