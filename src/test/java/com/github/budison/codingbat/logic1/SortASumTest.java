package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SortASumTest {
    @Test
    void testSortASum() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(SortASum.sortASum(10, 2), 20);
        softAssert.assertEquals(SortASum.sortASum(10, 20), 30);
        softAssert.assertEquals(SortASum.sortASum(0, 10), 20);
        softAssert.assertEquals(SortASum.sortASum(19, 0), 20);
        softAssert.assertEquals(SortASum.sortASum(1, 1), 2);

        // Then
        softAssert.assertAll();
    }
}
