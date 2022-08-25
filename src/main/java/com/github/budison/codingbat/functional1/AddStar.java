package com.github.budison.codingbat.functional1;

import java.util.List;

class AddStar {

    static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }
}
