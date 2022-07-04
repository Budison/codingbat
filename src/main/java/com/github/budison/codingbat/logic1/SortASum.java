package com.github.budison.codingbat.logic1;

abstract class SortASum {
    static int sortASum(int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 19 ? 20 : sum;
    }
}
