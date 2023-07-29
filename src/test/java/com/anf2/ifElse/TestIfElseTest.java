package com.anf2.ifElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestIfElseTest {
    TestIfElse testIfElse = new TestIfElse();

    @Test
    void testIfElse_inputAuto_Yes() {
        String input = "Auto";
        String expected = "Yes";
        Assertions.assertEquals(expected, testIfElse.testIfElse(input));
    }
    @Test
    void testIfElse_inputBmv_No() {
        String input = "Bmw";
        String expected = "No";
        Assertions.assertEquals(expected, testIfElse.testIfElse(input));
    }
}