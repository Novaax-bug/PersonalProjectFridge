package PersonalProject.Fridge;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private int ID;
    private int capacity;
    private ArrayList<Bottle> bottles;

    public int getID() {
        return ID;
    }

    Shelf(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
        this.bottles = new ArrayList<>();

    }

    public void addBottle(Bottle bottle) {
        if (this.capacity > 0) {
            this.bottles.add(bottle);
            this.capacity -= 1;
        }
    }

    public void removeBottle(Bottle currentBottle) {
        if (this.bottles.size() > 0) {
            if (this.bottles.contains(currentBottle)) {
                this.bottles.remove(currentBottle);
            }

        }
    }

    public void removeBottleByID(String ID) {
        if (this.bottles.size() > 0) {
            this.bottles.removeIf(bottle -> bottle.getID().equals(ID));
            if (this.bottles.size() <= 0) {
                System.out.println("The Shelf " + getID() + " is empty!");

            }
        }
    }
}

