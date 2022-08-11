package com.github.budison.codingbat.functional1;

import java.util.List;

class Doubling {

    static List<Integer> doubling(List<Integer> nums) {
       nums.replaceAll(integer -> integer * 2);
       return nums;
    }
}
