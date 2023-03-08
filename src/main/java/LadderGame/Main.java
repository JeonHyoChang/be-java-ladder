package LadderGame;

import LadderGame.domain.Ladder;
import LadderGame.view.Print;

public class Main {
    public static void main(String[] args) {
        // 사다리 값 입력
        Ladder ladder = new Ladder();

        // 사다리 설정
        ladder.setLadder();

        // 사다리 출력
        Print print = new Print();
        System.out.println();
        print.setPrint(ladder);
    }
}
