package app.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultViewTest {
    static ResultView resultView = new ResultView();

    @Test
    void getStatusView() {
        assertEquals(resultView.getStatusView("abc", 3), "abc : ---");
    }

    @Test
    void getWinnerView() {
        assertEquals(resultView.getWinnerView("a, b"), "a, b가 최종 우승했습니다.");
    }
}