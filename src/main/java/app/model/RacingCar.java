package app.model;

import java.util.Random;

public class RacingCar {
    private String name;
    private int position;

    public RacingCar(String name) {
        final int CAR_POSITION_INITIAL = 1;
        validateCarName(name);
        this.name = name;
        this.position = CAR_POSITION_INITIAL;
    }

    public String getCarName() {
        return name;
    }

    public int getCarPosition() {
        return position;
    }

    public void validateCarName(String name) {
        final int MAX_NAME_LENGTH = 5;
        final int MIN_NAME_LENGTH = 1;

        if (name.length() > MAX_NAME_LENGTH || name.length() < MIN_NAME_LENGTH) {
            throw new InputCarNameException("차 이름은 1자 이상 5자 이하로 가능합니다.");
        }
    }

    void tryMoving() {
        final int RANDOM_POOL = 10;
        final int RANDOM_BAR = 3;

        Random random = new Random();
        int temp = random.nextInt(RANDOM_POOL);
        if (temp > RANDOM_BAR) increasePosition();
    }

    void increasePosition() {
        final int CAR_POSITION_MOVING_GAP = 1;
        position += CAR_POSITION_MOVING_GAP;
    }

    public static class InputCarNameException extends RuntimeException {
        public InputCarNameException(String message) {
            super(message);
        }
    }
}

