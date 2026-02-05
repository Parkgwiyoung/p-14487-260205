import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RqTest {

    @Test
    @DisplayName("rq.getActionName() - 삭제")
    void t1() {

        Rq rq = new Rq("삭제?id=1");
        String actionName = rq.getAction();
        assertThat(actionName).isEqualTo("삭제");

    }

    @Test
    @DisplayName("rq.getActionName() - 수정")
    void t2() {

        Rq rq = new Rq("수정?id=1");
        String actionName = rq.getAction();
        assertThat(actionName).isEqualTo("수정");
    }
}
