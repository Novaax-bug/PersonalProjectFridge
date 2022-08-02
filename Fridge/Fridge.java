package PersonalProject.Fridge;


import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private int ID;
    private List<Shelf> shelfList;
    private int maxCapacityOfFridge;


    Fridge(int ID) {
        this.ID = ID;
        this.shelfList = new ArrayList<>();
        this.maxCapacityOfFridge = 30;
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

    public int getCapacityOfShelf() {
        return this.shelfList.size();
    }

    public int availabilityBottleInFridge() {
        int availabilityBottle = 0;
        for (Shelf shelf : this.shelfList) {
            availabilityBottle += shelf.totalBottleInShelf();
        }
        return availabilityBottle;

    }

    public double maxLiterInFridge() {
        double maxLiters = 0;
        for (Shelf shelf : this.shelfList) {
            maxLiters += shelf.getMaxLiterPerShelf();
        }
        return maxLiters;
    }

    public int emptyBottleInFridge() {
        int countEmptyBottle = 0;
        for (Shelf shelf : this.shelfList) {
            if (shelf.countEmptyBottle() > 0) {
                countEmptyBottle += shelf.countEmptyBottle();
            }
        }
        return countEmptyBottle;
    }

}
