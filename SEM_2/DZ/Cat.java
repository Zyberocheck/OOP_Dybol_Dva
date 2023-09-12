package SEM_1.SEM_2.DZ;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(int food) {
        if (food >= appetite) {
            satiety = true;
            System.out.printf("Кот %s съел %d еды и теперь он сыт.", name, appetite);
        } else {
            System.out.printf("Коту %s недостаточно еды и он не стал есть.", name);
        }
    }

}
