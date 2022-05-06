package app.logic;

import app.logic.exception.*;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    void validateRaceCount() {
        HashMap<String, Integer> successCases = new HashMap<>();
        HashMap<String, String> failCases = new HashMap<>();
        successCases.put("2", 2);
        successCases.put("1", 1);
        failCases.put("0", "시도 횟수는 0 또는 음수일 수 없습니다.");
        failCases.put("-1", "시도 횟수는 0 또는 음수일 수 없습니다.");
        failCases.put("99999999999999999999999999", "시도 횟수는 Integer이어야 합니다.");

        for (String key: successCases.keySet()) {
            assertEquals(Validator.validateRaceCount(key), successCases.get(key));
        }

        for (String key: failCases.keySet()) {
            InputRaceCountException e = assertThrows(
                    InputRaceCountException.class,
                    () -> {Validator.validateRaceCount(key);}
            );
            assertEquals(e.getMessage(), failCases.get(key));
        }
    }

    @Test
    void validateCarNames() {
        HashMap<String, String[]> successCases = new HashMap<>();
        HashMap<String, String> failCases = new HashMap<>();
        successCases.put("a,b,c", new String[] {"a", "b", "c"});
        failCases.put("a,b,a", "중복된 차 이름이 존재합니다.");
        failCases.put("a", "경주를 시작하려면 두 대 이상의 차가 필요합니다.");

        for (String key: successCases.keySet()) {
            assertArrayEquals(Validator.validateCarNames(key.split(",")), successCases.get(key));
        }

        for (String key: failCases.keySet()) {
            InputCarNamesException e = assertThrows(
                    InputCarNamesException.class,
                    () -> {Validator.validateCarNames(key.split(","));}
            );
            assertEquals(e.getMessage(), failCases.get(key));
        }
    }

    @Test
    void validateCarName() {
        HashMap<String, String> successCases = new HashMap<>();
        HashMap<String, String> failCases = new HashMap<>();
        successCases.put("abc", "abc");
        failCases.put("", "차 이름은 1자 이상 5자 이하로 가능합니다.");
        failCases.put("abcdef", "차 이름은 1자 이상 5자 이하로 가능합니다.");

        for (String key: successCases.keySet()) {
            assertEquals(Validator.validateCarName(key), successCases.get(key));
        }

        for (String key: failCases.keySet()) {
            InputCarNameException e = assertThrows(
                    InputCarNameException.class,
                    () -> {Validator.validateCarName(key);}
            );
            assertEquals(e.getMessage(), failCases.get(key));
        }
    }
}