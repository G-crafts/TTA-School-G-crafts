//katelynn.graham@malad.us

//Simple horse class by Katelynn Graham/G-crafts

//for CTE Software Development class 2023

public class Horse {
    String name;
    
    int birthYear;
    public Horse(String horseName, int year){

        name=horseName;
        birthYear=year;

    }

    void public changeName(String newName){
        name=newName;
    
    String public toString(){
        return name;
        
        Horse horse1= new Horse("dolly",2008);
        Horse horse2= new Horse("annie",1990);
        Horse horse3= new Horse("fabio",2004);

            System.out.println("dolly");
            System.out.println("annie");
            System.out.println("fabio");
            
        }
    }
}