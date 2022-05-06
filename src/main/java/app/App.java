package app;

import app.model.Race;

public class App {
    public static void main(String[] args) {
        Race race = new Race();
        race.setRace();
        race.startRace();
        race.printResult();
    }
}
