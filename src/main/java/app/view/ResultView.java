package app.view;

public class ResultView {
    public String getStatusView(String name, int position) {
        String result = String.format("%s : %s", name, "-".repeat(position));
        return result;
    }

    public String getWinnerView(String name) {
        String result = String.format("%s가 최종 우승했습니다.", name);
        return result;
    }
}
