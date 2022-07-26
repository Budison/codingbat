package com.github.budison.codingbat.logic1;

abstract class MaxMod5 {

    static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }

        return (a % 5 == b % 5) ? Math.min(a, b) : Math.max(a, b);
    }
}
