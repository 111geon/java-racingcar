package app.model;

import java.util.*;

public class Race {
    private List<RacingCar> racingCars;

    public void setRace(List<String> carNames) {
        List<RacingCar> racingCars = new ArrayList<>();
        for (String carName : carNames) racingCars.add(new RacingCar(carName));
        this.racingCars = racingCars;
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public void proceedRace() {
        for (RacingCar car: racingCars) {
            car.tryMoving();
        }
    }

    public List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        int maxPosition = 0;
        for (RacingCar car: racingCars) maxPosition = Math.max(car.getCarPosition(), maxPosition);
        for (RacingCar car: racingCars) appendWinner(winners, car, maxPosition);
        return winners;
    }

    private void appendWinner(List<String> winners, RacingCar car, int maxPosition) {
        if (car.getCarPosition() == maxPosition) {
            winners.add(car.getCarName());
        }
    }
}
