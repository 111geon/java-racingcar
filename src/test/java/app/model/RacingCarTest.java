package app.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RacingCarTest {
    @Test
    void increasePosition() {
        RacingCar car = new RacingCar("abc");
        car.increasePosition();
        assertThat(car.getCarPosition()).isEqualTo(2);
    }

    @Test
    void createRacingCar() {
        RacingCar car = new RacingCar("abc");
        assertThat(car.getCarName()).isEqualTo("abc");
        assertThatThrownBy(() -> { new RacingCar("abcdef"); })
                .isInstanceOf(RacingCar.InputCarNameException.class)
                .hasMessage("차 이름은 1자 이상 5자 이하로 가능합니다.");
    }
}