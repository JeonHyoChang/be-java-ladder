package LadderGame.view;

import LadderGame.domain.Line;

import java.util.ArrayList;

public class Output {
    // 이름 출력
    public void namePrint(ArrayList<String> names) {
        for (String name : names) {
            System.out.printf("%-6s", name); // 빈공간 출력 메소드 한줄로 표현
        }
        System.out.println();
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