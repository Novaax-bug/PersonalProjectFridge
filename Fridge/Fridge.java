package PersonalProject.Fridge;


import java.util.List;

public class Fridge {
    private int capacity;
    private int ID;
    private List<Shelf> shelfList;


    Fridge(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public void addShelf(Shelf currentShelf) {
        if (this.capacity > 0 && this.capacity < this.shelfList.size()) {
            shelfList.add(currentShelf);
            this.capacity -= shelfList.size();
        }
    }
    public void removeShelf(Shelf currentShelf){
        if (this.capacity > 0 && this.capacity < this.shelfList.size()) {
            for (Shelf shelf: this.shelfList) {
                if(shelf==currentShelf){
                    shelfList.remove(shelf);
                    this.capacity +=shelfList.size();
                }
            }
        }
    }
    public int currentBottle(){
        return this.capacity;
    }
}
