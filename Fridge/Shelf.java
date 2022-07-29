package PersonalProject.Fridge;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private int ID;
    private int capacity;
    private ArrayList<Bottle> bottles;

    Shelf(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public void addBottle(Bottle bottle) {
        if (this.capacity > 0) {
            this.bottles.add(bottle);
            this.capacity -= 1;
        }
    }

    public void removeBottle(Bottle currentBottle) {
        if (this.bottles.size() > 0) {
            for (Bottle bottle : this.bottles) {
                if (bottle == currentBottle) {
                    this.bottles.remove(bottle);
                }
            }
        }
    }

    public void removeBottleByID(String ID) {
        if (this.bottles.size() > 0) {
            for (Bottle currentID : this.bottles) {
                if (currentID.equals(ID)) {
                    this.bottles.remove(ID);
                }
            }
        }
    }

}
