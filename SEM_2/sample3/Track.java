package SEM_1.SEM_2.sample3;

public class Track extends Obstacle {

    private final int length;

    public Track (int length) {
        this.length = length;
    }

    @Override
    public int getLength(){
        return length;
    }
    

    @Override
    public int getHeight(){
        return 0;
    }
}
