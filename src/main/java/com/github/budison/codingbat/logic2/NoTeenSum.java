package com.github.budison.codingbat.logic2;

abstract class NoTeenSum {

    static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private static int fixTeen(int n) {
        return switch (n) {
            case 13, 14, 17, 18, 19 -> 0;
            default -> n;
        };
    }
}
