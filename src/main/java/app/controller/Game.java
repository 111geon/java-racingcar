package app.controller;

import java.util.ArrayList;
import java.util.List;
import app.model.Race;
import app.model.RacingCar;
import app.view.Receiver;
import app.view.Viewer;

public class Game {
    private final Receiver receiver;
    private final Race race;
    private final Viewer viewer;
    private int gameCount;

    public Game(Receiver receiver, Race race, Viewer viewer) {
        this.receiver = receiver;
        this.race = race;
        this.viewer = viewer;
    }

    public void play() {
        setGame();
        startGame();
        finishGame();
    }

    private void setGame() {
        try {
            List<String> carNames = receiver.askCarNames();
            race.setRace(carNames);
            gameCount = receiver.askGameCount();
        } catch(RacingCar.InputCarNameException error) {
            System.err.println(error.getMessage());
            setGame();
        }
    }

    private void startGame() {
        viewer.printStarter();
        viewer.printStatus(
                racingCarsToNameList(race.getRacingCars()),
                racingCarsToPositionList(race.getRacingCars())
        );
        for (int i=0; i<gameCount; i++) {
            race.proceedRace();
            viewer.printStatus(
                    racingCarsToNameList(race.getRacingCars()),
                    racingCarsToPositionList(race.getRacingCars())
            );
        }
    }

    private void finishGame() {
        List<String> winners = race.getWinners();
        viewer.printWinners(winners);
    }

    static List<String> racingCarsToNameList(List<RacingCar> racingCars) {
        List<String> nameList = new ArrayList<>();
        for (RacingCar racingCar: racingCars) {
            nameList.add(racingCar.getCarName());
        }
        return nameList;
    }

    static List<Integer> racingCarsToPositionList(List<RacingCar> racingCars) {
        List<Integer> positionList = new ArrayList<>();
        for (RacingCar racingCar: racingCars) {
            positionList.add(racingCar.getCarPosition());
        }
        return positionList;
    }
}
