package app.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RacingCarTest {
    @Test
    @DisplayName("RacingCar는 한 칸 전진할 수 있다.")
    void increasePosition() {
        RacingCar car = new RacingCar("abc");
        car.tryMoving(1, -1);
        assertThat(car.getCarPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("RacingCar를 이름과 함께 생성할 수 있다.")
    void createRacingCar() {
        RacingCar car = new RacingCar("abc");
        assertThat(car.getCarName()).isEqualTo("abc");
    }

    @Test
    @DisplayName("RacingCar를 생성하는 이름이 5자를 초과하면 에러 메시지를 표시한다.")
    void createRacingCarTooLong() {
        assertThatThrownBy(() -> { new RacingCar("abcdef"); })
                .isInstanceOf(RacingCarName.InputCarNameException.class)
                .hasMessage("차 이름은 1자 이상 5자 이하로 가능합니다.");
    }

    @Test
    @DisplayName("RacingCar를 생성하는 이름이 1자 미만이면 에러 메시지를 표시한다.")
    void createRacingCarTooShort() {
        assertThatThrownBy(() -> { new RacingCar(""); })
                .isInstanceOf(RacingCarName.InputCarNameException.class)
                .hasMessage("차 이름은 1자 이상 5자 이하로 가능합니다.");
    }
}