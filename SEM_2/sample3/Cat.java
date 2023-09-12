package SEM_1.SEM_2.sample3;

public class Cat extends BaseCat implements Runner {

    private final String name;

    private final int maxRun;

    private final int maxJump;

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

}

class BaseCat {

}
