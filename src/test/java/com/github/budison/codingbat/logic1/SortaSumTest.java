package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SortaSumTest {
    @Test
    void testSortaSum() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(SortaSum.sortaSum(10, 2), 20);
        softAssert.assertEquals(SortaSum.sortaSum(10, 20), 30);
        softAssert.assertEquals(SortaSum.sortaSum(0, 10), 20);
        softAssert.assertEquals(SortaSum.sortaSum(19, 0), 20);
        softAssert.assertEquals(SortaSum.sortaSum(1, 1), 2);

        // Then
        softAssert.assertAll();
    }
}
