package com.github.budison.codingbat.logic1;

abstract class LastDigit {

    static boolean lastDigit(int a, int b, int c) {
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        return (aLast == bLast || aLast == cLast || bLast == cLast);
    }
}
