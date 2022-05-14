package app.view;

import java.util.*;

public class Receiver {
    static Scanner sc = new Scanner(System.in);

    public List<String> askCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        List<String> carNames = Arrays.asList(sc.nextLine().split(","));
        try {
            validateCarNames(carNames);
            return carNames;
        } catch(InputCarNamesException error) {
            System.err.println(error.getMessage());
            return askCarNames();
        }
    }

    public int askGameCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String raceCount = sc.nextLine();
        try {
            return parseRaceCount(raceCount);
        } catch(InputRaceCountException error) {
            System.err.println(error.getMessage());
            return askGameCount();
        }
    }

    private int parseRaceCount(String raceCountInput) {
        int raceCount;
        try {
            raceCount = Integer.parseInt(raceCountInput);
        } catch(java.lang.NumberFormatException error) {
            throw new InputRaceCountException("시도 횟수는 Integer이어야 합니다.");
        }
        validateRaceCount(raceCount);
        return raceCount;
    }

    private void validateRaceCount(int raceCount) {
        if (raceCount < 1) {
            throw new InputRaceCountException("시도 횟수는 0 또는 음수일 수 없습니다.");
        }
    }

    private void validateCarNames(List<String> carNames) {
        if (carNames.size() < 2) {
            throw new InputCarNamesException("경주를 시작하려면 두 대 이상의 차가 필요합니다.");
        }

        Set<String> temp = new HashSet<>(carNames);
        if (carNames.size() != temp.size()) {
            throw new InputCarNamesException("중복된 차 이름이 존재합니다.");
        }

        for (String carName: carNames) {

        }
    }

    static class InputCarNamesException extends RuntimeException {
        public InputCarNamesException(String message) {
            super(message);
        }
    }

    static class InputRaceCountException extends RuntimeException {
        public InputRaceCountException(String message) {
            super(message);
        }
    }
}
