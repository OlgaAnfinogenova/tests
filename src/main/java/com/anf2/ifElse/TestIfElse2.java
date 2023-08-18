package com.anf2.ifElse;

/**
 * Function testIfElse must return:
 * -int 1 if first character in String(input) is 'A'
 * -int 2 if first character in String(input) is 'B'
 * -int 3 in another cases
 * You should use if-else construction and method charAt() https://proglang.su/java/strings-charat
 */
public class TestIfElse2 {
    public Integer testIfElse(String input) {
        char result = input.charAt(0);

        if (result == 'A') {
            return 1;
        } else if (result == 'B') {
            return 2;
        }

        return 3; //change 0 to variable which you want to return
    }
}