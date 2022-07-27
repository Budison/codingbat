package com.github.budison.codingbat.logic1;

abstract class SumLimit {

    static int sumLimit(int a, int b) {
        int sum = a + b;
        int sumDigits = (int) (Math.log10(sum) + 1);
        int aDigits = (int) (Math.log10(a) + 1);

        return aDigits == sumDigits ? sum : a;
    }
}
