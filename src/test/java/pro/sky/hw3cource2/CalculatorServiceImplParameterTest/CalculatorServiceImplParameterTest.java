package pro.sky.hw3cource2.CalculatorServiceImplParameterTest;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.hw3cource2.service.CalculatorServiceImpl;
import static pro.sky.hw3cource2.CalculatorServiceImplTestConstans.CalculatorServiceImplTestConstans.*;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParameterTest {


    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfPlus(double num1, double num2) {
        assertEquals(num1 + num2, calculatorService.plus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMinus(double num1, double num2) {
        assertEquals(num1 - num2, calculatorService.minus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiply(double num1, double num2) {
        assertEquals(num1 * num2, calculatorService.multiply(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivide(double num1, double num2) {
        assertEquals(num1 / num2, calculatorService.divide(num1, num2));
    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ZERO, TWO),
                Arguments.of(TWO, ONE),
                Arguments.of(FOUR, ONE),
                Arguments.of(ZERO, FOUR)
        );
    }
}
