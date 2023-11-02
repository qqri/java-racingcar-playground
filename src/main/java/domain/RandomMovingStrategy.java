package domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy{
    private static final int FOWARD_NUM = 4;
    private static final int MAX_BOUND = 10;
    @Override
    public boolean movable(){
        return randomNum() >= FOWARD_NUM;
    };

    private int randomNum() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }

}
