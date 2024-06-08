package mainClass;

import java.time.LocalDate;

import implClass.HotDrink;
import implClass.HotDrinkVM;

public class Main {

    public static void nicePrint(VendingMachine machine) {
        System.out.println("------");
        for (Product product : machine.getAllProducts()) {
            System.out.println(product);
        }
        System.out.println("------");
    }

    public static void main(String[] args) {

        HotDrinkVM machine = new HotDrinkVM();
        
        Product tea = new HotDrink("black tea", 1, LocalDate.now(), 0.5, 80);
        Product coffee = new HotDrink("black coffee", 1, LocalDate.now(), 0.5, 90);

        machine.addProduct(tea);
        machine.addProduct(coffee);

        nicePrint(machine);
        
        machine.getProduct("black tea", 0.5, 80);

        nicePrint(machine);
    }
}
