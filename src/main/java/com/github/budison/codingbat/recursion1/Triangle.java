package com.github.budison.codingbat.recursion1;

abstract class Triangle {
    static int triangle(int rows) {
        return switch (rows) {
            case 0 -> 0;
            case 1 -> 1;
            default -> rows + triangle(rows - 1);
        };
    }
}
