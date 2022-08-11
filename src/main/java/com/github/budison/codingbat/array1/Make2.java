package com.github.budison.codingbat.array1;

class Make2 {
    
    static int[] make2(int[] a, int[] b) {
        int[] ret = new int[2];
        int count = 0;
        int i = 0;

        while (i < a.length && count < 2) {
            ret[i] = a[i];
            i++;
            count++;
        }

        i = 0;

        while (i < b.length && count < 2) {
            ret[count] = b[i];
            i++;
            count++;
        }

        return ret;
    }
}
