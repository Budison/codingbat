package com.github.budison.codingbat.logic1;

class LessBy10 {

    static boolean lessBy10(int a, int b, int c) {

        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);

        return  (ab >= 10 || bc >= 10 || ac >= 10);
    }
}
