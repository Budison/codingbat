package com.github.budison.codingbat.logic1;

abstract class SortaSum {

    static int sortaSum(int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 19 ? 20 : sum;
    }
}
