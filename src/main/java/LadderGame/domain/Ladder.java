package LadderGame.domain;

import LadderGame.view.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ladder {
    private int ladder_height;
    private ArrayList<Line> ladder_set;
    private ArrayList<String> names;

    // 초기값 세팅
    public Ladder() {
        Input input = new Input();
        this.names = parsingName(input.getNames());
        this.ladder_height = input.getLadder_height();
        ladder_set = new ArrayList<>();
    }

    // 이름 분리
    public ArrayList<String> parsingName(String str) {
        // map을 통하여 5글자 제한 기능 구현
        return (ArrayList<String>) Arrays.stream(str.split(","))
                .map(s -> s.length() > 5 ? s.substring(0, 5) : s)
                .collect(Collectors.toList());
    }

    // 사다리 설정
    public void setLadder(int line) {
        for (int i = 0; i < ladder_height; i++) {
            ladder_set.add(new Line(names.size()));
        }
    }

    // 이름 출력
    public void namePrint() {
        for (String temp : names) {
            System.out.print(temp);
            spacePrint(temp.length());
        }
        System.out.println();
    }

    // 빈 공간 출력
    public void spacePrint(int length) {
        for (int i = 6 - length; i > 0; i--) {
            System.out.print(" ");
        }
    }

    public String boolToString(boolean point){
        if(point) return "-----";
        return "     ";
    }

    // 사다리 출력
    public void setPrint() {
        namePrint();

        for (Line line : ladder_set) {
            line.getPoints().forEach(point-> System.out.print("|"+boolToString(point)));
            System.out.println("|");
        }
    }
}
