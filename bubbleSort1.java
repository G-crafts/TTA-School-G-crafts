//katelynn.graham@malad.us

//for CTE software development 1

//instructor Mr Gross

class bubbleSort11{

    static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
    
                int temp;
    
    temp=arrayToSwap[lowerIndex];
    
    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
    
    arrayToSwap[lowerIndex+1]=temp;
    
    return arrayToSwap;
    
    }
    //making the array
    public static void main(String[] args){
    
    int[] arrayToSort = {1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};
        int i;
        //Printing out the unsorted array
        System.out.println ("Unsorted array");
        for (i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort [i]);
        }
    for (i = 0; i < arrayToSort.length-1; i++) {
            for (int j = 0; j < arrayToSort.length-1-i; j++){

        
             //Two elements that we know need swapped and are swapping them
             if (arrayToSort[j] > arrayToSort[j+1]) {
               arrayToSort=swapTwoArrayElements (arrayToSort, j);
             }
  
  
        }
    }
    //Print out sorted array
            System.out.println ("Sorted array");
      for (i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort [i]);
        }


   }
}