package com.github.budison.codingbat.logic1;

abstract class TeaParty {

    static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }

        if (tea / candy >= 2 || candy / tea >= 2) {
            return 2;
        }

        return 1;
    }
}