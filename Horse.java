//katelynn.graham@malad.us

//Simple horse class by Katelynn Graham/G-crafts

//for CTE Software Development class 2023

//Mr. Gross

public class Horse implements Comparable<Horse>{

    //Creating the method for the horse class
    String name;
    
    int birthYear;

    //Creating the parameters
    public Horse(String horseName, int year){

        name=horseName;
        birthYear=year;

    }
// creating a method for the horse to have a new name
    public void changeName(String newName){
        name=newName;
    }
    //toString method for the horse info
    public String toString(){
        String horseInfo;
        //making it so that that it prints out something like "dolly is 13 years old"
        horseInfo = name + " is " + birthYear + " years old ";


        return horseInfo;
        
     
            
        }

        //comparing and sorting the horses ages from youngest to oldest
        public int compareTo(Horse horse1){
            return birthYear-horse1.birthYear;
        }

    }
