package PersonalProject.Fridge;

import java.util.List;

public class Fridge {
    int capacity;
    int ID;
    List<Bottle> bottles;
    List<Shelf> shelves;

    Fridge(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

}
