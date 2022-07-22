package com.github.budison.codingbat.logic1;

abstract class NearTen {

    static boolean nearTen(int num) {
        return !(num % 10 > 2 && num % 10 < 8);
    }
}
