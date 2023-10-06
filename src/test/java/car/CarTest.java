package car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    Cars cars;
    @BeforeEach
    public void setup() {
        cars = new Cars("pobi,crong,honux");
    }

    @Test
    public void 자동차_이름_쉼표기준_구분() throws Exception {
        String input = "pobi,crong,honux";
        Cars cars = new Cars(input);

        //assertThat(cars.cars.size()).isEqualTo(3);
    }

    @Test
    public void 자동차_주어진수만큼_전진() throws Exception {
        Car car = new Car("test" , 0);
        car.go();
        assertThat(car.distance).isEqualTo(1);
    }

    @Test
    public void 자동차_경기한번할때() throws Exception {
        cars.play();
        cars.carList.stream().forEach(c -> System.out.println(c.name + " , " + c.distance));
    }

}
