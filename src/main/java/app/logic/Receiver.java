package app.logic;

import java.util.Scanner;
import app.logic.exception.*;

public class Receiver {
    static Scanner sc = new Scanner(System.in);

    public static String[] askCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] carNames = sc.nextLine().split(",");
        try {
            return Validator.validateCarNames(carNames);
        } catch(InputCarNamesException e) {
            System.err.println(e.getMessage());
            return askCarNames();
        }
    }

    public static int askRaceCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String temp = sc.nextLine();
        try {
            return Validator.validateRaceCount(temp);
        } catch(InputRaceCountException e) {
            System.err.println(e.getMessage());
            return askRaceCount();
        }
    }
}
