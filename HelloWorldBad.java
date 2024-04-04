/*
Error filled file created by
Kimg@techtrepacademy.com
for my java class to learn troubleshooting on
*/

// ORIGINAL FILE WITH EDITS

// Katelynn Graham is debugging this file
// katelynn.graham@malad.us
// Debugging assingnment pt 3
// Created by Kim Gross (Teacher)
// April 4 2024

// changing it to a public class
public class HelloWorldBad {
    public static void main(String[] args) {
        
        
        for (int i=0;i<25;i++){
            System.out.println("the value of i is "+i);
            //adding an extra = sign to make i = 1
            if (i==1){
            }
        }    
        //Moving the system.out statement out of the for and if statement block so that it prints out at the very end of the code
        System.out.println("i is equal to 1");

        }
    }