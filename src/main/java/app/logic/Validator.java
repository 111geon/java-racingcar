package app.logic;

import java.util.*;
import app.logic.exception.*;

public class Validator {

    public static int validateRaceCount(String s) {
        int raceCount;
        try {
            raceCount = Integer.parseInt(s);
        } catch(java.lang.NumberFormatException e) {
            throw new InputRaceCountException("시도 횟수는 Integer이어야 합니다.");
        }
        if (raceCount < 1) {
            throw new InputRaceCountException("시도 횟수는 0 또는 음수일 수 없습니다.");
        }
        return raceCount;
    }

    public static String[] validateCarNames(String[] carNames) {
        if (carNames.length < 2) {
            throw new InputCarNamesException("경주를 시작하려면 두 대 이상의 차가 필요합니다.");
        }
        Set<String> temp = new HashSet<>(Arrays.asList(carNames));
        if (carNames.length != temp.size()) {
            throw new InputCarNamesException("중복된 차 이름이 존재합니다.");
        }
        return carNames;
    }

    public static String validateCarName(String name) {
        if (name.length() > 5 || name.length() < 1) {
            throw new InputCarNameException("차 이름은 1자 이상 5자 이하로 가능합니다.");
        }
        return name;
    }
}
