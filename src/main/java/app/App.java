package app;

import app.controller.Game;
import app.model.Race;

public class App {
    public static void main(String[] args) {
        Race race = new Race();
        Game game = new Game(race);
        game.play();
    }
}
