package com.github.budison.codingbat.logic1;

class NearTen {

    static boolean nearTen(int num) {
        return !(num % 10 > 2 && num % 10 < 8);
    }
}
