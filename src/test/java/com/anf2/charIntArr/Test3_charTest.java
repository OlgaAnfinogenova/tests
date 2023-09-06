package com.anf2.charIntArr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3_charTest {
    Test3_char test3Char = new Test3_char();

    @Test
    void testChar_inputAbc_thenCharArray() {
        String input = "abcde";
        char[] expected = new char[]{'a','b','c','d','e'};
        Assertions.assertArrayEquals(expected, test3Char.testChar(input));
    }
    @Test
    void testChar_input123_thenNull() {
        String input = "123";
        Assertions.assertNull(test3Char.testChar(input));
    }
}