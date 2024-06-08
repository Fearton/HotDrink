package implClass;

import java.time.LocalDate;

import mainClass.Product;

public class HotDrink extends Product {
    
    private double volume;
    private double temp;

    public HotDrink(String name, double price, LocalDate releaseDate, double volume, double temp) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.temp = temp;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getTemp() {
        return this.temp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", releaseDate=" + super.getReleaseDate() +
                ", volume= " + this.volume +
                ", temp= " + this.temp + 
                '}';
    }
}
