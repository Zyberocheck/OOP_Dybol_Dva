package SEM_1;

import java.util.ArrayList;
import java.util.List;

public class Sem_1 {

    public static void main(String[] args) {

        Product product1 = new Product();
        // product1.name = "Product1";
        // product1.brand = "Brand1";
        // product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Product2", "Brand2", 100);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Product3");
        // product3.price = -100;
        // product3.name = "A";
        System.out.println(product3.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("Бутылка1", "ООО Молоко", 350, 1.5, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("Бутылка с водой", "ООО Источник", 350, 1.0);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Бутылка с водой", "ООО Источник", 150, 1.5);

        Product bottleOfWater3 = new BottleOfWater("Бутылка с водой", "ООО Источник", 250, 2.0);

        Product snek1 = new Snek("Сникерс", "ООО Ромашкино", 110, "Small");

        Product snek2 = new Snek("Сникерс", "ООО Ромашкино", 150, "Double");

        Product snek3 = new Snek("Марс", "ООО Ромашкино", 110, "Small");

        Product snek4 = new Snek("Марс", "ООО Ромашкино", 150, "Double");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(snek1);
        products.add(snek2);
        products.add(snek3);
        products.add(snek4);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка с водой", 1.5);
        if (bottleOfWater != null) {
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        } else {
            System.out.println("Такой бутылки нет в автомате");
        }

        Snek snek = vendingMachine.getSnek("Сникерс", "Double");
        if (snek != null) {
            System.out.println("Вы получили: ");
            System.out.println(snek.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет");
        }

    }

}
