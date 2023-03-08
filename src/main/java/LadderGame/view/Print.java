package LadderGame.view;

import LadderGame.domain.Line;

import java.util.ArrayList;

public class Print {
    // 이름 출력
    public void namePrint(ArrayList<String> names) {
        for (String name : names) {
            System.out.print(name);
            spacePrint(name.length());
        }
        System.out.println();
    }

    // 빈 공간 출력
    public void spacePrint(int length) {
        for (int i = 6 - length; i > 0; i--) {
            System.out.print(" ");
        }
    }

    // Boolean(true) -> String("-----")
    public String boolToString(boolean point) {
        if (point) return "-----";
        return "     ";
    }

    // 사다리 출력
    public void setPrint(ArrayList<Line> lines) {
        for (Line line : lines) {
            line.getPoints().forEach(point -> System.out.print("|" + boolToString(point)));
            System.out.println("|");
        }
    }
}
