package com.github.budison.codingbat.logic2;

class LoneSum {

    static int loneSum(int a, int b, int c) {
        // Case #0:     a == b == c
        if (a == b && b == c) {
            return 0;
        }

        // Case #1:     a == b
        if (a == b) {
            return c;
        }

        // Case #2:     b == c
        if (b == c) {
            return a;
        }

        // Case #3:     a == c
        if (a == c) {
            return b;
        }

        return a + b + c;
    }
}
