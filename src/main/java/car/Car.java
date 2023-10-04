package car;

public class Car {
    String name;
    int distance;

    public Car(String name, int distance) {
        this.name = new CarName(name).name;
        this.distance = distance;
    }


    public void go(int randomNo) {
        if(randomNo >= 4) this.distance++;
    }
}
