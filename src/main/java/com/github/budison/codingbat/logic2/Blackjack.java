package com.github.budison.codingbat.logic2;

class Blackjack {

    static int blackjack(int a, int b) {
        if (a <= 21 && b <= 21) {
            return Math.max(a, b);
        }

        if (a <= 21) {
            return a;
        }

        if (b <= 21) {
            return b;
        }

        return 0;
    }
}
