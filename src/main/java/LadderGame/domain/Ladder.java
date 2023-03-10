package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;
import java.util.HashMap;

public class Ladder {
    private final int ladderHeight;
    private final ArrayList<Line> ladderSet;
    private final LadderInOutData ladderData;
    private final HashMap<String, String> resultMap;

    // 초기값 세팅
    public Ladder(LadderInOutData ladderData, int ladderHeight) {
        this.ladderHeight = ladderHeight;
        this.ladderData = ladderData;
        ladderSet = new ArrayList<>();
        resultMap = new HashMap<>();
    }

    // 사다리 설정
    public void makeLadder() {
        for (int i = 0; i < ladderHeight; i++) {
            ladderSet.add(new Line(ladderData.getNameSize()));
        }
    }

    // 출력 호출
    public void callOfLadderOutput() {
        Output output = new Output();

        ladderData.callOfNameOutput();
        output.printLadder(ladderSet);
        ladderData.callOfResultOutput();
    }
}
