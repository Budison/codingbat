package com.github.budison.codingbat.logic2;

abstract class MakeBricks {

    static boolean makeBricks(int small, int big, int goal) {
        // Failure case #1 -- overall not enough bricks
        if (goal > small + big * 5) {
            return false;
        }

        // Failure case #2 -- not enough small bricks
        if (goal % 5 > small) {
            return false;
        }

        return true;
    }
}
