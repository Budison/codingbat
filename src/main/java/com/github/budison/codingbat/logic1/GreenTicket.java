package com.github.budison.codingbat.logic1;

class GreenTicket {

    static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }

        return (a == b || b == c || a == c) ? 10 : 0;
    }
}
