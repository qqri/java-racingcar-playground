package domain;

public class Car {

    private static final int FOWARD_NUM = 4;
    private final String name ;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        if(randomNum() >= FOWARD_NUM) {
            this.position++;
        }
    }

    protected int randomNum() {
        return (int) Math.random() * 9;
    }

}
