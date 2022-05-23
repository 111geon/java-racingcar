package app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.model.RacingCarName;
import app.model.Race;
import app.model.RacingCar;
import app.view.Receiver;
import app.view.Viewer;

public class Game {
    private final Race race;
    private int gameCount;

    public Game(Race race) {
        this.race = race;
    }

    public void play() {
        setGame();
        startGame();
        finishGame();
    }

    private void setGame() {
        try {
            List<String> carNames = Receiver.askCarNames();
            race.setRace(carNames);
            gameCount = Receiver.askGameCount();
        } catch(RacingCarName.InputCarNameException error) {
            System.err.println(error.getMessage());
            setGame();
        }
    }

    private void startGame() {
        Viewer.printStarter();
        Viewer.printStatus(racingCarsToMap(race.getRacingCars()));
        for (int i=0; i<gameCount; i++) {
            race.proceedRace();
            Viewer.printStatus(racingCarsToMap(race.getRacingCars()));
        }
    }

    private void finishGame() {
        List<String> winners = race.getWinners();
        Viewer.printWinners(winners);
    }

    private Map<String, Integer> racingCarsToMap(List<RacingCar> racingCars) {
        Map<String, Integer> racingCarMap = new HashMap<>();
        for (RacingCar racingCar: racingCars) {
            racingCarMap.put(racingCar.getCarName(), racingCar.getCarPosition());
        }
        return racingCarMap;
    }
}
