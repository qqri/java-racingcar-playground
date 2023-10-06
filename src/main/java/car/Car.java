package car;

public class Car {
    public String name;
    public int distance;

    public Car(String name, int distance) {
        this.name = new CarName(name).name;
        this.distance = distance;
    }


    public void go() {
        if(makeRandomNum() >= 4) this.distance++;
    }

    public int makeRandomNum() {
        return (int) (Math.random()*9);
    }

    public String getName() {
        return name;
    }
}
