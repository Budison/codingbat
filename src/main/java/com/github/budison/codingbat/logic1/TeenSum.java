package com.github.budison.codingbat.logic1;

class TeenSum {

    static int teenSum(int a, int b) {
        return (13 <= a && a <= 19 || 13 <= b && b <= 19) ? 19 : a + b;
    }
}
