package com.anf2.ifElse;

/**
 * Function testIfElse must return String "Yes" if first character in String(input) is "A" and return "No" if it is not
 * You should use if-else construction and method charAt() https://proglang.su/java/strings-charat
 */
public class TestIfElse
{
    public String testIfElse( String input ) {
        String result;

        if (input.charAt(0)=='A'){
            result= "Yes";
        } else {
            result= "No";
        }

        return result;
    }
}
