package com.github.budison.codingbat.logic1;

abstract class CaughtSpeeding {

    static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed >= 81) {
            return 2;
        } else if (speed >= 61) {
            return 1;
        } else {
            return 0;
        }
    }
}