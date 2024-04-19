
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;
    @BeforeEach
    void setUp(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void digitCalculateWith1() {
        int input = 1;
        int expected = 1;
        int result = sumCalculator.sum(input);

        assertEquals(expected, result);
    }


    @Test
    void digitCalculateWith3() {
        int input = 3;
        int expected = 6;
        int result = sumCalculator.sum(input);

        assertEquals(expected, result);
    }

    @Test
    void digitCalculateWith0() {
        int input = 0;
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(input));
    }
}