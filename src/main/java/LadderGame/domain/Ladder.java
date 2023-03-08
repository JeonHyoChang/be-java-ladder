package LadderGame.domain;

import LadderGame.view.Input;
import LadderGame.view.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ladder {
    private final int ladder_height;
    private final ArrayList<Line> ladder_set;
    private final ArrayList<String> names;

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
    public void setLadder() {
        for (int i = 0; i < ladder_height; i++) {
            ladder_set.add(new Line(names.size()));
        }
    }

    // 출력 호출
    public void callPrint() {
        Print print = new Print();

        print.namePrint(names);
        print.setPrint(ladder_set);
    }
}
