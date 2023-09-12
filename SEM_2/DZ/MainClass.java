package SEM_1.SEM_2.DZ;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 51);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(50);
        plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
