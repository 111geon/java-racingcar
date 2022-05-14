package app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import app.model.RacingCar;

class GameTest {

    @Test
    void racingCarsToNameList() {
        List<RacingCar> racingCars = new ArrayList<>();
        racingCars.add(new RacingCar("a"));
        racingCars.add(new RacingCar("b"));
        assertThat(Game.racingCarsToNameList(racingCars)).isEqualTo(Arrays.asList("a", "b"));
    }

    @Test
    void racingCarsToPositionList() {
        List<RacingCar> racingCars = new ArrayList<>();
        racingCars.add(new RacingCar("a"));
        racingCars.add(new RacingCar("b"));
        assertThat(Game.racingCarsToPositionList(racingCars)).isEqualTo(Arrays.asList(1, 1));
    }
}