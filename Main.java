package PersonalProject.Fridge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fridge firstFridge = new Fridge(1, 10);
        Bottle firstBottle = new Bottle(2, "Sprite");
        Shelf firstShelf = new Shelf(1, 5);
// it must be a list with bottle;
        List<Bottle> bottles = new ArrayList<>();
        bottles.add(firstBottle);//fill list with bottleObject.
        //it is same with shelf list.
        List<Shelf> shelfList = new ArrayList<>();
        shelfList.add(firstShelf);//fill list with Shelf.

        System.out.println(firstShelf.returnCapacity(2));

    }
}
