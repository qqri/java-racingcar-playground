package print;
import car.Car;
import car.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PrintTest {
    Cars cars = new Cars();
    @BeforeEach
    public void setup(){
        Car car1 = new Car("test1",3);
        Car car2 = new Car("test2",3);
        Car car3 = new Car("test3",1);

        cars.carList.add(car1);
        cars.carList.add(car2);
        cars.carList.add(car3);
    }

    @Test
    public void Cars_실행결과_출력() throws Exception {
        PrintView.eachPlayPrint(cars);
        //assertThat(result).isEqualTo("testt : ---");
    }

    @Test
    public void Cars_최종우승자_거리_출력() throws Exception {
        int winnerDist = cars.winnerDist();
        assertThat(winnerDist).isEqualTo(3);
    }

    @Test
    public void Cars_최종우승자_출력() throws Exception {
        List<Car> winnerCars = cars.winner();
        assertThat(winnerCars.size()).isEqualTo(2);
        assertThat(winnerCars.get(0).name).isEqualTo("test1");
        assertThat(winnerCars.get(1).name).isEqualTo("test2");
    }
}
