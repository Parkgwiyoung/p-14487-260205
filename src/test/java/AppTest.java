import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void t1(){
        App app = new App();
        int rst = app.plus(1, 2);
        
        assertThat(rst).isEqualTo(3);
    }

    private <SELF extends AbstractBigDecimalAssert<SELF>> AbstractBigDecimalAssert<SELF> assertThat(int rst) {
    }

}
