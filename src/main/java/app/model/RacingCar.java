package app.model;

import java.util.Random;

public class RacingCar {
    private static final int RANDOM_POOL = 10;
    private static final int RANDOM_BAR = 3;
    private final RacingCarName name;
    private final RacingCarPosition position;

    public RacingCar(String name) {
        this.name = new RacingCarName(name);
        this.position = new RacingCarPosition();
    }

    public String getCarName() {
        return name.getName();
    }

    public int getCarPosition() {
        return position.getPosition();
    }

    void tryMoving() {
        tryMoving(RANDOM_POOL, RANDOM_BAR);
    }

    void tryMoving(int randomPool, int randomBar) {
        Random random = new Random();
        int temp = random.nextInt(randomPool);
        if (temp > randomBar) position.increasePosition();
    }

    boolean isWinner(int winnerScore) {
        if(position.isEqual(winnerScore)) return true;
        return false;
    }
}
