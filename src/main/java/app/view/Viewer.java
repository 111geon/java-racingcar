package app.view;

import java.util.List;

import static java.lang.System.out;

public class Viewer {
    public void printStarter() {
        out.println("\n실행 결과");
    }

    public void printStatus(List<String> names, List<Integer> positions) {
        for (int i=0; i<names.size(); i++) {
            out.printf("%s : %s%n", names.get(i), "-".repeat(positions.get(i)));
        }
        out.println("");
    }

    public void printWinners(List<String> winners) {
        String winnerNames = String.join(", ", winners);
        out.printf("%s가 최종 우승했습니다.%n", winnerNames);
    }
}
