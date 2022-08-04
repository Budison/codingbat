package com.github.budison.codingbat.logic2;

abstract class RoundSum {

    static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int n) {
        return (n % 10 >= 5) ? (n + 5) / 10 * 10 : n / 10 * 10;
    }
}
