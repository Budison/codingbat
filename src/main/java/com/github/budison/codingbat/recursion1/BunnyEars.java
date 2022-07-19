package com.github.budison.codingbat.recursion1;

abstract class BunnyEars {
    static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        return 2 + bunnyEars(bunnies - 1);
    }
}
