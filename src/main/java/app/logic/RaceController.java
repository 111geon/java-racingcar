package app.logic;

import java.util.ArrayList;
import java.util.Random;
import app.model.RacingCar;
import app.view.ResultView;

public class RaceController {
    static ResultView resultViewer = new ResultView();

    public void proceedRace(RacingCar[] racingCars) {
        for (RacingCar car: racingCars) {
            tryMoving(car);
        }
    }

    private void tryMoving(RacingCar car) {
        Random random = new Random();
        int temp = random.nextInt(10);

        if (temp <= 3) return;

        car.increasePosition();
        return;
    }

    public void printStatus(RacingCar[] racingCars) {
        for (RacingCar car: racingCars) {
            System.out.println(resultViewer.getStatusView(car.name, car.position));
        }
        System.out.println("");
    }

    public String[] getWinners(RacingCar[] racingCars) {
        ArrayList<String> winners = new ArrayList<>();
        int maxPosition = findMaxPosition(racingCars);

        for (RacingCar car: racingCars) {
            winners = appendWinner(maxPosition, car, winners); // 정말 이렇게까지 해야하는 겁니까..!
        }
        return winners.toArray(new String[0]);
    }

    private ArrayList<String> appendWinner(int maxPosition, RacingCar car, ArrayList<String> winners) {
        if (car.position == maxPosition) {
            winners.add(car.name);
        }
        return winners;
    }

    private int findMaxPosition(RacingCar[] racingCars) {
        int maxPosition = 0;
        for (RacingCar car: racingCars) {
            maxPosition = Math.max(car.position, maxPosition);
        }
        return maxPosition;
    }

    public void printWinners(String[] winners) {
        String winnerNames = String.join(", ", winners);
        System.out.println(resultViewer.getWinnerView(winnerNames));
    }
}
