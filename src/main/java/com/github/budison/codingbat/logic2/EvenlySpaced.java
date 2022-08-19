package com.github.budison.codingbat.logic2;

import java.util.Arrays;

class EvenlySpaced {

    static boolean evenlySpaced(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        return Math.abs(arr[0] - arr[1]) == Math.abs(arr[1] - arr[2]);
    }
}
