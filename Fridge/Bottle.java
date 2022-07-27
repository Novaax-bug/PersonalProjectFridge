package PersonalProject.Fridge;

public class Bottle {
    private String ID;
    private double maxVolume = 1;
    private String brand = "Coca-Cola";
    private double currentVolume = 0;

    Bottle() {

    }

    Bottle(String ID) {
        this.ID = ID;
    }

    Bottle(double maxVolume, String brand) {
        this.maxVolume = maxVolume;
        this.brand = brand;
    }

    Bottle(String brand,String ID) {
        this.ID = ID;
        this.brand = brand;
    }

    Bottle(String brand, double maxVolume, double currentVolume) {
        this(maxVolume, brand);
        this.currentVolume = currentVolume;
    }

    public void fill(double volume) {
        this.currentVolume += volume;
        if (this.currentVolume > this.maxVolume) {
            this.currentVolume = this.maxVolume;
        }
    }

    public void spill() {
        this.currentVolume = 0;
    }

    public double pour(double pourVolume) {
        // maxVolume = 2; currentVolume = 1l  needVolume = 3; 1
        // maxVolume = 2  currenetVolume = 1 needVolume = 0.250; 0.250
        // maxVolume = 2 currentVolume = 1 needVolume = 1 ; 1
        if (this.currentVolume <= pourVolume) {
            double volumeGiven;
            volumeGiven = this.currentVolume;
            this.currentVolume = 0;
            return volumeGiven;
        }
        this.currentVolume -= pourVolume;
        return pourVolume;
    }

    public void replace(String name, double volume) {
        this.brand = name;
        // max 2 l cur 1 voda +250  coca -cola
        // max 2 cur 1 voda  +3l rakiq
        // max 2 cur 1 voda  +1l prqsno mlqko
        this.spill();
        this.fill(volume);
    }

}
