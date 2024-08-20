package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    void setUpCalculator() {
        sumCalculator = new SumCalculator();
    }
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,6"
    })
    void sumTest(int input, int expected){
        Assertions.assertEquals(expected, sumCalculator.sum(input));
    }
    @ParameterizedTest
    @CsvSource({
            "0",
            "-4",
            "-431"
    })
    void sumArgumentExceptionTest(int input){
        Assertions.assertThrows(IllegalArgumentException.class,() -> sumCalculator.sum(input));
    }
    @Test
    void sumSizeExceptionTest(){
        Assertions.assertThrows(ArithmeticException.class, () -> sumCalculator.sum(66000));
    }
}