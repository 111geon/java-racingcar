package app.model;

import app.logic.Validator;

public class RacingCar {
    String name;
    int position;
    public RacingCar(String name) {
        this.name = Validator.validateCarName(name);
        this.position = 1;
    }
}
