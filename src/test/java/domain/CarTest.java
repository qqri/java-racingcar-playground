package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class CarTest {
    
    @Test
    public void 이동() throws Exception {
        //given
        Car car = new Car("pobi"){
            @Override
            protected int randomNum() {
                return 4;
            }
        };
        //when
        car.move();
        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }
    @Test
    public void 정지() throws Exception {
        //given
        Car car = new Car("crong"){
            @Override
            protected int randomNum() {
                return 3;
            }
        };
        //when
        car.move();
        //then
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
