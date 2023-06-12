package com.skypro.calculatortest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    public void plusTest(){
        Assertions.assertEquals(4, service.plus(2,2));
        Assertions.assertEquals(400, service.plus(332,68));
    }
    @Test
    public void minusTest(){
        Assertions.assertEquals(0, service.minus(2,2));
        Assertions.assertEquals(10, service.minus(19,9));
    }
    @Test
    public void multiplyTest(){
        Assertions.assertEquals(4, service.multiply(2,2));
        Assertions.assertEquals(120, service.multiply(10,12));
    }
    @Test
    public void divideTest(){
        Assertions.assertEquals(1, service.divide(2,2));
        Assertions.assertEquals(111, service.divide(222,2));
    }
    @Test
    public void throwExceptionTest(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->  service.divide(3,0));
        Assertions.assertThrows(IllegalArgumentException.class,() ->  service.divide(0,0));
    }


}
