package car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    public List<Car> carList;

    public Cars() {this.carList = new ArrayList<Car>(); }
    public Cars(String input) {
        this.carList = makeCarList(input);
    }

    public void play() {
        carList.stream()
                .forEach(c-> c.go());
    }

    private List<Car> makeCarList(String input) {
        return Arrays.asList(input.split(","))
                .stream()
                .map(c -> new Car(c,0))
                .collect(Collectors.toList())
                ;

    }

    public List<Car> winner() {
        int maxDist = winnerDist();
        return carList.stream()
                .filter(c -> (c.distance==maxDist))
                .collect(Collectors.toList());
    }


    public int winnerDist() {
        return carList.stream()
                .mapToInt(i -> i.distance)
                .max()
                .getAsInt();
    }
}
