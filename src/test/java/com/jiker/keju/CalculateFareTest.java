import org.junit.Test;
import com.jiker.keju.taxi.CalculateFare;

import static org.junit.Assert.assertEquals;


public class CalculateFareTest {

    @Test
    public void getReceipt_and_kilometre_2_test() {
        int result = new CalculateFare().calculate(2, 0);
        assertEquals(6, result);
    }

    @Test
    public void getReceipt_and_kilometre_3_test() {
        int result = new CalculateFare().calculate(3, 0);
        assertEquals(7, result);
    }

    @Test
    public void getReceipt_and_kilometre_8_andminute_2_test() {
        int result = new CalculateFare().calculate(8, 2);
        assertEquals(11, result);
    }

    @Test
    public void getReceipt_and_kilometre_10_and_minute_2_test() {
        int result = new CalculateFare().calculate(10, 2);
        assertEquals(14, result);
    }
}
