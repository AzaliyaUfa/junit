package ru.ibs.intership;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJunitHW {

    private JunitHW junitHW;

    @BeforeEach
    void init() {
        junitHW = new JunitHW();
    }

    @Test
    void fizzBuzzTest() {
        String expected = "1 FizzBuzz 13 8 Fizz FizzBuzz ";
        StringBuilder actual = new StringBuilder("");
        Integer intArray[] = {1, 15, 13, 8, 9, 0};
        for (int i = 0; i < intArray.length; i++) {
            actual.append(JunitHW.fizzBuzz(intArray[i]) + " ");
        }
        Assertions.assertEquals(expected, actual.toString());
    }

    @Test
    void fileContentTest () {
        String expected = "1 FizzBuzz 13 8 Fizz FizzBuzz ";
        StringBuilder actual = new StringBuilder("");
        Integer intArray[] = {1, 15, 13, 8, 9, 0};
        for (int i = 0; i < intArray.length; i++) {
            actual.append(JunitHW.fizzBuzz(intArray[i]) + " ");
        }
        Assertions.assertEquals(expected, actual.toString());
    }
}
