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
                {new ArrayList<>(List.of(1, 2, 3)), new ArrayList<>(List.of(2, 4, 6))},
                {new ArrayList<>(List.of(6, 8, 6, 8, -1)), new ArrayList<>(List.of(12, 16, 12, 16, -2))},
                {new ArrayList<>(List.of()), new ArrayList<>(List.of())},
                {new ArrayList<>(List.of(5)), new ArrayList<>(List.of(10))},
                {new ArrayList<>(List.of(5, 10)), new ArrayList<>(List.of(10, 20))},
                {new ArrayList<>(List.of(8, -5, 7, 3, 109)), new ArrayList<>(List.of(16, -10, 14, 6, 218))}
        };
    }

    @Test(dataProvider = "testDoublingProvider")
    void testDoubling(ArrayList<Integer> input, ArrayList<Integer> expected) {
        assertEquals(Doubling.doubling(input), expected);
    }
}
