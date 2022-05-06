package app.logic;

import app.model.RacingCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceControllerTest {

    @Test
    void proceedRace() {
    }

    @Test
    void printStatus() {
    }

    @Test
    void getWinners() {
        RaceController raceController = new RaceController();
        RacingCar carA = new RacingCar("a");
        RacingCar carB = new RacingCar("b");
        RacingCar carC = new RacingCar("c");
        carA.increasePosition();
        carC.increasePosition();
        RacingCar[] cars = {carA, carB, carC};
        String[] winners  = raceController.getWinners(cars);
        assertArrayEquals(winners, new String[] {"a", "c"});
    }

    @Test
    void printWinners() {
    }
}