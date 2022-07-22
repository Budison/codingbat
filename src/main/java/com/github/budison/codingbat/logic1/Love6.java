package com.github.budison.codingbat.logic1;

abstract class Love6 {

    static boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }
}
