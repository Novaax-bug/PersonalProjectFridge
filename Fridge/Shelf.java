package PersonalProject.Fridge;

import java.util.List;

public class Shelf {
    private int ID;
    private int capacity;
    private List<Bottle> bottles;

    Shelf(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public void addBottle(Bottle bottle) {
        if (this.capacity >= this.bottles.size()) {
            this.bottles.add(bottle);
            this.capacity -= this.bottles.size();

        }
    }

    public void removeBottle(Bottle currentBottles) {
        if (this.bottles.size() > 0) {
            for (Bottle bottle : this.bottles) {
                if (bottle == currentBottles) {
                    this.bottles.remove(bottle);
                }
            }
        }
    }
}
