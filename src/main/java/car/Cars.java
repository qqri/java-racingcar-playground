package car;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    public List<Car> cars;

    public void play() {
        cars.stream()
                .forEach(c-> c.go());
    }

    public Cars(String input) {
        this.cars = makeCarList(input);
    }

    private List<Car> makeCarList(String input) {
        return Arrays.asList(input.split(","))
                .stream()
                .map(c -> new Car(c,0))
                .collect(Collectors.toList())
                ;

    }


}
