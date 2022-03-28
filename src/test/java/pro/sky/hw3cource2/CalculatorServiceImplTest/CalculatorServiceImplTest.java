package pro.sky.hw3cource2.CalculatorServiceImplTest;

import org.junit.jupiter.api.Test;
import pro.sky.hw3cource2.Exception.DivideZeroException;
import pro.sky.hw3cource2.service.CalculatorServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.hw3cource2.CalculatorServiceImplTestConstans.CalculatorServiceImplTestConstans.*;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1and2() {
        assertEquals(THREE, calculatorService.plus(ONE, TWO));
    }

    @Test
    public void shouldReturn2WhenSum0and2() {
        assertEquals(TWO, calculatorService.plus(ZERO, TWO));
    }

    @Test
    public void shouldReturn0WhenMinus2and2() {
        assertEquals(ZERO, calculatorService.minus(TWO, TWO));
    }

    @Test
    public void shouldReturn1WhenMinus4and3() {
        assertEquals(ONE, calculatorService.minus(FOUR, THREE));
    }

    @Test
    public void shouldReturn4WhenMultiply2and2() {
        assertEquals(FOUR, calculatorService.multiply(TWO, TWO));
    }

    @Test
    public void shouldReturn2WhenMultiply1and2() {
        assertEquals(TWO, calculatorService.multiply(ONE, TWO));
    }

    @Test
    public void shouldReturn2WhenDivide4and2() {
        assertEquals(TWO, calculatorService.divide(FOUR, TWO));
    }

    @Test
    public void shouldReturn2WhenDivide2and1() {
        assertEquals(TWO, calculatorService.divide(TWO, ONE));
    }

    @Test
    public void shouldThorwZeroDivideException() {
        assertThrows(DivideZeroException.class, () -> calculatorService.divide(FOUR, ZERO));
    }
}
