package app.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    @Test
    void increasePosition() {
        RacingCar car = new RacingCar("abc");
        car.increasePosition();
        car.increasePosition();
        car.increasePosition();
        assertEquals(car.position, 4);
    }
}