package com.github.budison.codingbat.logic1;

abstract class Old35 {
    static boolean old35(int n) {
        return (n % 3 == 0 ^ n % 5 == 0);   // '^' = XOR-Operator
    }
}
