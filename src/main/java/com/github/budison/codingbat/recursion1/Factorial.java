package com.github.budison.codingbat.recursion1;

abstract class Factorial {
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }
}
