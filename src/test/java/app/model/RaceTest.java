package app.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class RaceTest {
    @Test
    void getWinners() {
        Race race = new Race();
        race.setRace(Arrays.asList("a", "b", "c"));
        List<RacingCar> racingCars = race.getRacingCars();
        racingCars.get(0).increasePosition();
        assertThat(race.getWinners()).isEqualTo(Arrays.asList("a"));
    }
}