package com.github.budison.codingbat.logic2;

class MakeChocolate {

    static int makeChocolate(int small, int big, int goal) {
        int remainder;

        if (goal >= 5 * big) {
            // We can use all big bars
            remainder = goal - 5 * big;
        } else {
            // We can't use all big bars
            remainder = goal % 5;
        }

        if (remainder <= small) {
            // The remainder can be covered by small bars
            return remainder;
        } else {
            // The remainder can't be covered by small bars - no packaging possible
            return -1;
        }
    }
}
