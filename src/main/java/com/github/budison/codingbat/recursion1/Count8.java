package com.github.budison.codingbat.recursion1;

class Count8 {
    
    static int count8(int n) {
        int count = 0;

        if (n % 10 == 8) {
            if (n / 10 % 10 == 8) {
                count = 2;
            } else {
                count = 1;
            }
        }

        return n / 10 == 0 ? count : count8(n / 10) + count;
    }
}
