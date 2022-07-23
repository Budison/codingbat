package com.github.budison.codingbat.logic1;

abstract class TwoAsOne {

    static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }
}
