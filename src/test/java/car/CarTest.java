package car;

import car.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {



    @Test
    public void 자동차_주어진수만큼_전진() throws Exception {
        Car car = new Car("test" , 0);
        int randomNo = 3;
        car.go(randomNo);
        assertThat(car.distance).isEqualTo(1);
    }

}
