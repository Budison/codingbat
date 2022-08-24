package com.github.budison.codingbat.functional1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class DoublingTest {

    @DataProvider
    public Object[][] testDoublingProvider() {
        return new Object[][]{
                {List.of(1, 2, 3), List.of(2, 4, 6)},
                {List.of(6, 8, 6, 8, -1), List.of(12, 16, 12, 16, -2)},
                {List.of(), List.of()},
                {List.of(5), List.of(10)},
                {List.of(5, 10), List.of(10, 20)},
                {List.of(8, -5, 7, 3, 109), List.of(16, -10, 14, 6, 218)}
        };
    }

    @Test(dataProvider = "testDoublingProvider")
    void testDoubling(List<Integer> input, List<Integer> expected) {
        assertEquals(Doubling.doubling(new ArrayList<>(input)), expected);
    }
}
