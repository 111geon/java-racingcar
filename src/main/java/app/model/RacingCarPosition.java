package app.model;

public class RacingCarPosition {
    private static final int CAR_POSITION_INITIAL = 1;
    private static final int CAR_POSITION_MOVING_GAP = 1;
    private int position;

    RacingCarPosition() {
        this.position = CAR_POSITION_INITIAL;
    }

    int getPosition() {
        return position;
    }

    void increasePosition() {
        position += CAR_POSITION_MOVING_GAP;
    }

    boolean isEqual(int winnerScore) {
        if(position == winnerScore) return true;
        return false;
    }
}
