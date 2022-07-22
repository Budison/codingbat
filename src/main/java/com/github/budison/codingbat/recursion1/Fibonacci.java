package com.github.budison.codingbat.recursion1;

abstract class Fibonacci {
    
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
