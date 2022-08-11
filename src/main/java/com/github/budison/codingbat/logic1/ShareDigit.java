package com.github.budison.codingbat.logic1;

class ShareDigit {

    static boolean shareDigit(int a, int b) {
        int aLeft = a / 10;
        int bLeft = b / 10;
        int aRight = a % 10;
        int bRight = b % 10;

        return aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight;
    }
}
