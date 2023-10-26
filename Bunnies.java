public class Bunnies extends Bunny1 {
    private int size;
    
    public void size(){
        System.out.println("centimeters");
    }
    public void size(int sizeInCentimeters){
        for (int i = 0; i < sizeInCentimeters; i++) {
        System.out.println("centimeters");
    }
}

    public int getSize() {
        return size;
    }

    public void setSize (int size) {
        this.size = size;
    }
}

public class Bunnies2 extends Bunny1 {
    private String breed;

    public void breed(){
        System.out.println("breed");
    }

    public void breed() {
        System.out.println("HollandLop");
    }
}