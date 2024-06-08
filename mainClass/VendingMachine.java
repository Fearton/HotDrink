package mainClass;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getAllProducts() {
        return this.products;
    }
}
