package PersonalProject.Fridge;

public class Main {
    public static void main(String[] args) {

        Fridge firstFridge = new Fridge(1, 30);//bottle capacity for current fridge is 30 /
        Shelf firstShelf = new Shelf(1, 5);
        Shelf secondShelf = new Shelf(2,5);
        Shelf thirdShelf = new Shelf(3,5);
        Shelf fourShelf = new Shelf(4,5);
        Shelf fiveShelf = new Shelf(5,5);

        Bottle firstBottle = new Bottle(1.5, "Coca-cola");
        Bottle secondBottle = new Bottle(1.5, "Coca-cola");
        Bottle thirdBottle = new Bottle(1.5, "Coca-cola");
        Bottle fourBottle = new Bottle(1.5, "Coca-cola");
        Bottle fiveBottle = new Bottle(1.5, "Coca-cola");
        Bottle sixBottle = new Bottle(1.5, "Fanta");
        Bottle sevenBottle = new Bottle(1.5, "Sprite");
        Bottle ninthBottle = new Bottle(1.5, "Sprite");
        Bottle tenBottle = new Bottle(1.5, "Sprite");

        Bottle rakiqPeshterska = new Bottle(1, "Peshterska");
        Bottle rakiqBurgaska = new Bottle(1, "Burgaska");
        Bottle rakiqPomoriiska = new Bottle(1, "Pomoriiska");
        Bottle rakiqKarnobatska = new Bottle(1, "Karnobatska");

        Bottle firstBeerPirinsko = new Bottle(0.500, "Pirisnko");
        Bottle secondBeerPirinsko = new Bottle(0.500, "Pirisnko");
        Bottle thirdBeerPirinsko = new Bottle(0.500, "Pirisnko");
        Bottle fourBeerPirinsko = new Bottle(0.500, "Pirisnko");
        Bottle fiveBeerPirinsko = new Bottle(0.500, "Pirisnko");
        Bottle sixBeerPirinsko = new Bottle(0.500, "Pirisnko");
        Bottle sevenBeerPirinsko = new Bottle(0.500, "Pirisnko");

        Bottle VIPBottle = new Bottle("1","VIP",1);
        firstShelf.removeBottle(sevenBottle);
        secondShelf.addBottle(firstBeerPirinsko);
        firstShelf.removeBottleByID(VIPBottle);
    }
}
