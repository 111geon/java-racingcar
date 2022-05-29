package app.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class RaceTest {
    @Test
    @DisplayName("경주의 우승자를 찾아낼 수 있다.")
    void getWinners() {
        Race race = new Race();
        race.setRace(Arrays.asList("a", "b", "c"));
        List<RacingCar> racingCars = race.getRacingCars();
        racingCars.get(0).tryMoving(1, -1);
        assertThat(race.getWinners()).isEqualTo(Arrays.asList("a"));
    }
}