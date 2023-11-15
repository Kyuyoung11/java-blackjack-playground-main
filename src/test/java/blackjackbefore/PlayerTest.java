package blackjackbefore;

import blackjackbefore.domains.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void 생성자() {
        Player p1 = new Player("pobi");
        assertEquals(p1.getName(), "pobi");
    }
}
