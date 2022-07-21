package PersonalProject.Fridge;

public class Bottle {
    double volume;
    String brand;

    Bottle(double maxVolume, String brand) {
        this(brand);
        this.maxVolume = maxVolume;
    }

    Bottle(double volume, String brand, double currentVolume) {
        this(volume, brand);
        this.currentVolume = currentVolume;
    }

    /* Доливам */
    public void fill(double additionalVolume) {
        this.currentVolume += additionalVolume;
        if (this.maxVolume < this.currentVolume) {
            this.currentVolume = this.maxVolume;
        }
    }

    // Изливам
    public double pour(double volume) {
//        250ml, iskam 1l
        double returnedVolume;
        if (volume > this.currentVolume) {
            return this.currentVolume;
        }

        return volume;
    }

    public String change(String brand) {
        if (!this.brand.equals(brand)) {
            return this.brand = brand;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Volume -> " + maxVolume +
                " Brand -> " + brand;

    }
}
