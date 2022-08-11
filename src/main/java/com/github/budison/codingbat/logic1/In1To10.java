package com.github.budison.codingbat.logic1;

class In1To10 {

    static boolean in1To10(int n, boolean outsideMode) {
        return outsideMode ? (n <= 1 || 10 <= n) : (1 <= n && n <= 10);
    }
}
