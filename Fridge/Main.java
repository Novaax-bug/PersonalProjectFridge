package PersonalProject.Fridge;

public class Main {
    public static void main(String[] args) {

        Fridge firstFridge = new Fridge(1);
        Shelf firstShelf = new Shelf(1, 5);
        Shelf secondShelf = new Shelf(2, 5);
        Shelf thirdShelf = new Shelf(3, 5);
        Shelf fourShelf = new Shelf(4, 5);
        Shelf fiveShelf = new Shelf(5, 5);
        firstFridge.addShelf(firstShelf);
        firstFridge.addShelf(secondShelf);
        firstFridge.addShelf(thirdShelf);
        firstFridge.addShelf(fourShelf);
        firstFridge.addShelf(fiveShelf);

        Bottle firstBottle = new Bottle("1", "Coca-cola");
        Bottle secondBottle = new Bottle("2", "Coca-cola");
        Bottle thirdBottle = new Bottle("3", "Coca-cola");
        Bottle fourBottle = new Bottle("4", "Coca-cola");
        Bottle fiveBottle = new Bottle("5", "Coca-cola");
        Bottle sixBottle = new Bottle("6", "Fanta");
        Bottle sevenBottle = new Bottle("7", "Sprite");
        Bottle ninthBottle = new Bottle("8", "Sprite");
        Bottle tenBottle = new Bottle("9", "Sprite");

        Bottle rakiqPeshterska = new Bottle("10", "Peshterska");
        Bottle rakiqBurgaska = new Bottle("11", "Burgaska");
        Bottle rakiqPomoriiska = new Bottle("12", "Pomoriiska");
        Bottle rakiqKarnobatska = new Bottle("13", "Karnobatska");

        Bottle firstBeerPirinsko = new Bottle("14", "Pirisnko");
        Bottle secondBeerPirinsko = new Bottle("15", "Pirisnko");
        Bottle thirdBeerPirinsko = new Bottle("16", "Pirisnko");
        Bottle fourBeerPirinsko = new Bottle("17", "Pirisnko");
        Bottle fiveBeerPirinsko = new Bottle("18", "Pirisnko");
        Bottle sixBeerPirinsko = new Bottle("19", "Pirisnko");
        Bottle sevenBeerPirinsko = new Bottle("20", "Pirisnko");

        Bottle VIPBottle = new Bottle("21", "VIP", 1);

        firstShelf.removeBottle(sevenBottle);
        firstShelf.removeBottleByID("1");

        secondShelf.addBottle(firstBeerPirinsko);
        secondShelf.addBottle(secondBeerPirinsko);

        firstBeerPirinsko.fill(0.50);

        System.out.println(firstFridge.maxLiterInFridge());

    }
}
