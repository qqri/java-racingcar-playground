package domain;

import java.util.Random;

public class Car {


    private final String name ;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable()) {
            this.position++;
        }
    }

    public void move2(RandomMovingStrategy randomMovingStrategy) {
        if(randomMovingStrategy.movable()) {
            this.position++;
        }
    }



}
