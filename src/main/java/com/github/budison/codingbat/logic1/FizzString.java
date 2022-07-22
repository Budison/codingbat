package com.github.budison.codingbat.logic1;

abstract class FizzString {

    static String fizzString(String str) {
        String ret = "";
        if (str.toLowerCase().startsWith("f")) {
            ret += "Fizz";
        }

        if (str.toLowerCase().endsWith("b")) {
            ret += "Buzz";
        }

        return ret.isEmpty() ? str : ret;
    }
}
