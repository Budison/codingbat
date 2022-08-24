package com.github.budison.codingbat.functional1;

import java.util.List;

class Square {

    static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(integer -> integer * integer);
        return nums;
    }
}
