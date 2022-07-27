package com.github.budison.codingbat.logic1;

abstract class BlueTicket {

    static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }

        return (ab == bc + 10 || ab == ac + 10) ? 5 : 0;
    }
}
