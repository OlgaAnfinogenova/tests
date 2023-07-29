package com.anf2.ifElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestIfElseTest2 {
    TestIfElse2 testIfElse = new TestIfElse2();

    @Test
    void testIfElse_inputAuto_1() {
        String input = "Auto";
        int expected = 1;
        Assertions.assertEquals(expected, testIfElse.testIfElse(input));
    }
    @Test
    void testIfElse_inputBmv_2() {
        String input = "Bmv";
        int expected = 2;
        Assertions.assertEquals(expected, testIfElse.testIfElse(input));
    }
    @Test
    void testIfElse_inputSeat_3() {
        String input = "Seat";
        int expected = 3;
        Assertions.assertEquals(expected, testIfElse.testIfElse(input));
    }
}