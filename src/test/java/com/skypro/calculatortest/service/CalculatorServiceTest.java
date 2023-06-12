package com.skypro.calculatortest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest(){
        Assertions.assertEquals(4,calculatorService.plus(2,2));
        Assertions.assertEquals(400,calculatorService.plus(332,68));
    }
    @Test
    public void minusTest(){
        Assertions.assertEquals(0,calculatorService.minus(2,2));
        Assertions.assertEquals(10,calculatorService.minus(19,9));
    }
    @Test
    public void multiplyTest(){
        Assertions.assertEquals(4,calculatorService.multiply(2,2));
        Assertions.assertEquals(120,calculatorService.multiply(10,12));
    }
    @Test
    public void divideTest(){
        Assertions.assertEquals(1,calculatorService.divide(2,2));
        Assertions.assertEquals(111,calculatorService.divide(222,2));
    }
    @Test
    public void throwExceptionTest(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->  calculatorService.divide(3,0));
        Assertions.assertThrows(IllegalArgumentException.class,() ->  calculatorService.divide(0,0));
    }


}
