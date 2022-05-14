package app;

import app.controller.Game;
import app.model.Race;
import app.view.Receiver;
import app.view.Viewer;

public class App {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Race race = new Race();
        Viewer viewer = new Viewer();
        Game game = new Game(receiver, race, viewer);
        game.play();
    }
}
