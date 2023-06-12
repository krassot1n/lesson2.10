package com.skypro.calculatortest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedCalculatorServiceTest {
    private final CalculatorService service = new CalculatorService();

    public static Stream<Arguments> paramsForTest() {
        return Stream.of(
                Arguments.of(3, 10),
                Arguments.of(10, 10),
                Arguments.of(15, 62),
                Arguments.of(32, 2),
                Arguments.of(18, 2),
                Arguments.of(42, 38));
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void plusParametrizedTest(int num1, int num2) {
        Assertions.assertEquals(num1 + num2, service.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void minusParametrizedTest(int num1, int num2) {
        Assertions.assertEquals(num1 - num2, service.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void multiplyParametrizedTest(int num1, int num2) {
        Assertions.assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void divideParametrizedTest(int num1, int num2) {
        Assertions.assertEquals((double) num1 / num2, service.divide(num1, num2));
    }
}
