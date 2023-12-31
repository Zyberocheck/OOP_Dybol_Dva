package SEM_1.SEM_3;

public abstract class Animal {

    protected String name;
    protected int maxRun;
    protected int maxSwim;

    private static int idCounter;
    private static int counter;

    public static int getIdCounter() {
        return idCounter;
    }

    public static int getCounter() {
        return counter;
    }

    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    static {
        System.out.println("Initializer - static - Animal");
        idCounter = 1000;
    }

    {
        System.out.println("Initializer - Animal");
        id = ++idCounter;
        counter++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Constructor - Animal");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance < maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distance);
        }
    }

    public void swim(int distance) {
        if (distance < maxRun) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distance);
        }
    }

}
