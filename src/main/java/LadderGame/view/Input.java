package LadderGame.view;

import java.util.Scanner;

public class Input {
    private final String names;
    private final int ladder_height;

    public Input(){
        Scanner in = new Scanner(System.in);

        System.out.print("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)\n");
        this.names = in.nextLine();

        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        this.ladder_height = in.nextInt();
    }

    public String getNames() {
        return this.names;
    }

    public int getLadder_height() {
        return this.ladder_height;
    }
}
