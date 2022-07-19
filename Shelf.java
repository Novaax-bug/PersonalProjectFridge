package PersonalProject.Fridge;

public class Shelf {
    int ID;
    int capacity;

    Shelf(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public int returnCapacity(int capacity) {
        if (this.capacity > capacity) {
            return capacity;
        }
        return this.capacity;
    }
}
