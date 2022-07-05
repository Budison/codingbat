package com.github.budison.codingbat.logic1;

abstract class SpecialEleven {
    static boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }
}
