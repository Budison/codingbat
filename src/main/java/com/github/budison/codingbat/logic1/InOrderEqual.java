package com.github.budison.codingbat.logic1;

class InOrderEqual {

    static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }
}
