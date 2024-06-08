package implClass;

import java.util.Iterator;

import mainClass.Product;
import mainClass.VendingMachine;

public class HotDrinkVM extends VendingMachine{
    
    public HotDrinkVM() {
        super();
    }

    public Product getProduct(String name, double volume, double temp) {
        Iterator<Product> iterator = super.getAllProducts().iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemp() == temp) {
                    iterator.remove();
                    return hotDrink;
                }
            }
        }
        System.out.println("No such product: " + name + " with volume: " + volume + " and temperature: " + temp);
        return null;
    }
}
