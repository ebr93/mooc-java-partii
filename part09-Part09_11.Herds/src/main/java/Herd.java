import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }

    // adds Movable object
    // THIS WORKS BECAUSE IT IS TAKING IN ORGANISM class OBJECTS
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    // move the Movable objects inside of the list
    // THIS WORKS BECAUSE IT IS TAKING IN ORGANISM class OBJECTS
    @Override
    public void move(int dx, int dy) {
        for (Movable movObject : this.list) {
            movObject.move(dx, dy);
        }
    }

    // returns String of list
    // THIS WORKS BECAUSE IT IS TAKING IN ORGANISM class OBJECTS
    @Override
    public String toString() {
        String herd = "";

        for (Movable movObject : this.list) {
            herd += movObject + "\n";
        }
        
        return herd;
    }
}
