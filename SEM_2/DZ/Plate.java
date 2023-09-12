package SEM_1.SEM_2.DZ;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            getFood();
        }
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
