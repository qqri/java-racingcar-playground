package input;
import car.Car;
import car.CarName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class InputTest {

    @Test
    public void 자동차이름_5자리_넘을수없다() throws Exception {
        String name = "aassdd";
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(IllegalStateException.class);
    }
}
