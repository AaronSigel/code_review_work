import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(-10, calc.add(-5, -5));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.dif(5, 2));
        assertEquals(-2, calc.dif(1, 3));
        assertEquals(0, calc.dif(7, 7));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.div(10, 5));
        assertEquals(-2, calc.div(-10, 5));
        assertThrows(ArithmeticException.class, () -> calc.div(10, 0));
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.times(2, 3));
        assertEquals(0, calc.times(0, 10));
        assertEquals(-15, calc.times(-3, 5));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        // Предположим, что solver выполняет ( (5+3)*(10-2) ) / 4 = (8*8)/4 = 16
        assertEquals(16, calc.solver());
    }
}
