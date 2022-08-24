package com.github.budison.codingbat.functional1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SquareTest {

    @DataProvider
    public Object[][] testSquareProvider() {
        return new Object[][]{
                {List.of(1, 2, 3), List.of(1, 4, 9)},
                {List.of(6, 8, -6, -8, 1), List.of(36, 64, 36, 64, 1)},
                {List.of(), List.of()},
                {List.of(12), List.of(144)},
                {List.of(5, 10), List.of(25, 100)},
                {List.of(6, -3, 12, 23, 4, 1, 19, 11), List.of(36, 9, 144, 529, 16, 1, 361, 121)}
        };
    }

    @Test(dataProvider = "testSquareProvider")
    void testSquare(List<Integer> input, List<Integer> expected) {
        assertEquals(Square.square(new ArrayList<>(input)), expected);
    }
}
