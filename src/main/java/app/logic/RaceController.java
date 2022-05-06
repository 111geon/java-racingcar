package app.logic;

import java.util.Random;
import app.model.RacingCar;
import app.view.ResultView;

public class RaceController {
    public void proceedRace(RacingCar[] racingCars) {
        for (RacingCar car: racingCars) {
            tryMoving(car);
        }
    }

    private void tryMoving(RacingCar car) {
        Random random = new Random();
        int temp = random.nextInt(10);

        if (temp <= 3) {
            return;
        }

        car.position += 1;
        return;
    }

    public void printStatus(RacingCar[] racingCars) {
        ResultView resultViewer = new ResultView();
        for (RacingCar car: racingCars) {
            System.out.println(resultViewer.getStatusView(car));
        }
        System.out.println("");
    }
}
