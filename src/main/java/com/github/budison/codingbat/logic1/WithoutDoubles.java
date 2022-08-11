package com.github.budison.codingbat.logic1;

class WithoutDoubles {

    static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == die2) {
                return ++die1 == 7 ? 1 + die2 : die1 + die2;
            }

            return die1 + die2;
        }

        return die1 + die2;
    }
}
