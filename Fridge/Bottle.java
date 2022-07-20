package PersonalProject.Fridge;

public class Bottle {
    double volume;
    String brand;

    Bottle(double volume, String brand) {
        this.volume = volume;
        this.brand = brand;
    }

    public void fill(int currentVolume) {
        if (this.volume > currentVolume) {
            this.volume = currentVolume;
        }
    }

    public String remove(String currentBrand) {
        if (this.brand.equals(currentBrand)) {
            return this.brand = currentBrand;
        }

        return null;
    }

    public String change(String brand) {
        if (!this.brand.equals(brand)) {
            return this.brand = brand;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Volume -> " + volume +
                " Brand -> " + brand;

    }
}
