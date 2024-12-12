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
        //TODO inser your realisation in test-method dif
    }

    @Test
    void div() {
        //TODO inser your realisation in test-method div
    }

    @Test
    void times() {
        //TODO inser your realisation in test-method times
    }

    @Test
    void solver() {
        //TODO inser your realisation in test-method solver
    }
}