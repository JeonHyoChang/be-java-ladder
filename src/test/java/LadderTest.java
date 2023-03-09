import LadderGame.domain.Ladder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadderTest {
    @Test
    @DisplayName("1. 유저 생성 테스트")
    void userMake(){
        Ladder ladder = new Ladder(5, "pobi,honux,crong,jk");
        ladder.setLadder();
        System.out.println("시작");
    }

    @Test
    @DisplayName("시작후 또 시작함")
    void qqq(){
        System.out.println("또 시작");
    }
}
