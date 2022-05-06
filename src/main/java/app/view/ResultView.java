package app.view;

import app.model.RacingCar;

public class ResultView {
    public String getStatusView(RacingCar car) {
        String status = String.format("%s : %s", car.name, "-".repeat(car.position));
        return status;
    }
}
