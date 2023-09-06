package com.anf2.charIntArr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3_intTest {
    Test3_int test3Int = new Test3_int();

    @Test
    void testChar_inputAbc_thenCharArray() {
        String input = "12345";
        int[] expected = new int[]{1,2,3,4,5};
        Assertions.assertArrayEquals(expected, test3Int.testChar(input));
    }
    @Test
    void testChar_input123_thenNull() {
        String input = "abc";
        Assertions.assertNull(test3Int.testChar(input));
    }
}