package com.github.budison.codingbat.logic1;

abstract class FizzString2 {

    static String fizzString2(int n) {
        StringBuilder ret = new StringBuilder();

        if (n % 3 == 0) {
            ret.append("Fizz");
        }

        if (n % 5 == 0) {
            ret.append("Buzz");
        }

        if (ret.isEmpty()) {
            ret.append(n);
        }

        return ret.append("!").toString();
    }
}
