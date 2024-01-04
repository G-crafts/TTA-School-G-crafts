//katelynn.graham@malad.us
//Katelynn Graham
//Software and Development Semester 1
//Exceptions Programming Project

public class ExceptionsErrorProject{
    public static void main(String[] args){
        // int arr[]=new int[7];
        //creating a integer origin statement
        int[] myIntArray = new int[6];

    //lets make some integer statements!
    myIntArray [0] = 15/5;
    myIntArray [1] = 4;
    //The int statement with an exception
    myIntArray [2] = 0;
    // lets add the try statement
    try
{
    //Starting with 0, has to be less than 3,  +1
    for (int x=0; x<3; x++){
        //dividing all by 400 and printing it out
    System.out.println(400/myIntArray[x]);
    }
}

//handling the exception
    catch(ArithmeticException e)
{
    System.out.println(e);
}
{
    System.out.println("rest of the code can continue without the program crashing");
}
    //Continuing the string list after the exception
    myIntArray [3] = 18/9;
    //Adding another exception
    myIntArray [4] = 24;
    //Adding another try/catch statement
    try
    {
        //creating the index out of bounds error
        System.out.println(myIntArray [6]);
    }
    //handling the exception with another catch statement
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    {
        //printing out the rest of the code without crashing the program
        System.out.println("rest of the code can continue without the program crashing");
    }
     }
}