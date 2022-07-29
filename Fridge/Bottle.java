package PersonalProject.Fridge;

public class Bottle {
    private String ID;
    private double maxVolume = 1;
    private String brand = "Coca-Cola";

    public String getID() {
        return ID;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public String getBrand() {
        return brand;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    private double currentVolume = 0;

    Bottle(String ID) {
        this.ID = ID;
    }

    Bottle(String ID, String brand) {
        this.ID = ID;
        this.brand = brand;
    }

    Bottle(String ID, String brand, double maxVolume) {
        this(ID, brand);
        this.maxVolume = maxVolume;
    }


    Bottle(String ID, String brand, double maxVolume, double currentVolume) {
        this(ID, brand, maxVolume);
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
