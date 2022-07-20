package com.github.budison.codingbat.recursion1;

abstract class SumDigits {
    static int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        
        return sumDigits(n / 10) + sumDigits(n % 10);
    }
}
