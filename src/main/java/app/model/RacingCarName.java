package app.model;

public class RacingCarName {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_NAME_LENGTH = 1;
    private String carName;

    RacingCarName(String name) {
        validateCarName(name);
        this.carName = name;
    }

    String getName() {
        return carName;
    }

    void validateCarName(String name) {
        if (name.length() > MAX_NAME_LENGTH || name.length() < MIN_NAME_LENGTH) {
            throw new InputCarNameException("차 이름은 "+MIN_NAME_LENGTH+"자 이상 "+MAX_NAME_LENGTH+"자 이하로 가능합니다.");
        }
    }

    public static class InputCarNameException extends RuntimeException {
        public InputCarNameException(String message) {
            super(message);
        }
    }
}
