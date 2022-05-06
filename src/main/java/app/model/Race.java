package app.model;

import app.logic.Receiver;
import app.logic.exception.InputCarNameException;

public class Race {
    RacingCar[] racingCars;
    int raceCount;

    public void setRace() {
        String[] carNames = Receiver.askCarNames();
        try {
            this.racingCars = buildRacingCars(carNames);
            this.raceCount = Receiver.askRaceCount();
        } catch(InputCarNameException e) {
            System.err.println(e.getMessage());
            setRace();
        }
    }

    private RacingCar[] buildRacingCars(String[] carNames) {
        RacingCar[] racingCars = new RacingCar[carNames.length];
        for (int i=0; i<carNames.length; i++) {
            racingCars[i] = new RacingCar(carNames[i]);
        }
        return racingCars;
    }

    public void startRace() {
    }

    public void printResult() {
    }
}
