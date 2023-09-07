package SEM_1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products) {
            if(product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Snek getSnek(String name, String size) {
        for (Product product : products) {
            if(product instanceof Snek){
                Snek snek = (Snek)product;
                if(snek.getName().equals(name) && snek.getSize() == size){
                    return snek;
                }
            }
        }
        return null;
    }
    
}
