package com.github.budison.codingbat.logic1;

class RedTicket {

    static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }

        if (a == b && a == c) {
            return 5;
        }

        return (b != a && c != a) ? 1 : 0;
    }
}
