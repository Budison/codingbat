package com.github.budison.codingbat.functional1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class AddStarTest {

    @DataProvider
    public Object[][] testAddStarProvider() {
        return new Object[][]{
                {List.of("a", "bb", "ccc"), List.of("a*", "bb*", "ccc*")},
                {List.of("hello", "there"), List.of("hello*", "there*")},
                {List.of(), List.of()},
                {List.of("*"), List.of("**")},
                {List.of("empty", "string", ""), List.of("empty*", "string*", "*")},
        };
    }

    @Test(dataProvider = "testAddStarProvider")
    void testAddStar(List<String> input, List<String> expected) {
        assertEquals(AddStar.addStar(new ArrayList<>(input)), expected);
    }
}
