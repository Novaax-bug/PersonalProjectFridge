package PersonalProject.Fridge;


import java.util.List;

public class Fridge {
    private int ID;
    private List<Shelf> shelfList;


    Fridge(int ID, int capacity) {
        this.ID = ID;

    }

    public void addShelf(Shelf currentShelf) {
        this.shelfList.add(currentShelf);
    }

    public void removeShelf(Shelf currentShelf) {
        for (Shelf shelf : this.shelfList) {
            if (shelf == currentShelf) {
                shelfList.remove(shelf);
            }
        }
    }
    public int capacityOfShelf(){
        return this.shelfList.size();
    }

}
