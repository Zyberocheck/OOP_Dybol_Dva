package SEM_1;

public class Snek extends Product {

    private String size;

    public Snek (String name, String brand, double price, String size) {
        super(name, brand, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String displayInfo(){
        return String.format("[Батончик шоколадный] %s - %s - %.2f - %s", name, brand, price, size);
    }
    
}
