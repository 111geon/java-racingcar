package app.view;

import java.util.List;
import java.util.Map;

import static java.lang.System.out;

public class Viewer {
    public static void printStarter() {
        out.println(System.lineSeparator() + "실행 결과");
    }

    public static void printStatus(Map<String, Integer> racingCars) {
        for (Map.Entry<String, Integer> racingCar: racingCars.entrySet()) {
            out.printf("%s : %s" + System.lineSeparator(), racingCar.getKey(), "-".repeat(racingCar.getValue()));
        }
        out.println("");
    }

    public static void printWinners(List<String> winners) {
        String winnerNames = String.join(", ", winners);
        out.printf("%s가 최종 우승했습니다." + System.lineSeparator(), winnerNames);
    }
}
