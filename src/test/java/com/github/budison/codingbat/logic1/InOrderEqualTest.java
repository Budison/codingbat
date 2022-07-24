package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InOrderEqualTest {

    @Test
    void testInOrderEqual() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(InOrderEqual.inOrderEqual(2, 5, 11, false));
        softAssert.assertTrue(InOrderEqual.inOrderEqual(5, 5, 7, true));
        softAssert.assertTrue(InOrderEqual.inOrderEqual(3, 4, 4, true));
        softAssert.assertTrue(InOrderEqual.inOrderEqual(5, 5, 5, true));

        softAssert.assertFalse(InOrderEqual.inOrderEqual(5, 7, 6, false));
        softAssert.assertFalse(InOrderEqual.inOrderEqual(5, 5, 7, false));
        softAssert.assertFalse(InOrderEqual.inOrderEqual(2, 2, 1, true));
        softAssert.assertFalse(InOrderEqual.inOrderEqual(0, 1, 0, true));

        // Then
        softAssert.assertAll();
    }
}
