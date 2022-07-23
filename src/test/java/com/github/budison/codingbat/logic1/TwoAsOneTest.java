package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TwoAsOneTest {

    @Test
    void testTwoAsOne() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(TwoAsOne.twoAsOne(1, 2, 3));
        softAssert.assertTrue(TwoAsOne.twoAsOne(3, 2, 1));
        softAssert.assertTrue(TwoAsOne.twoAsOne(2, 3, 1));
        softAssert.assertTrue(TwoAsOne.twoAsOne(5, 3, -2));
        softAssert.assertTrue(TwoAsOne.twoAsOne(9, 4, 5));

        softAssert.assertFalse(TwoAsOne.twoAsOne(3, 2, 2));
        softAssert.assertFalse(TwoAsOne.twoAsOne(5, 3, -3));
        softAssert.assertFalse(TwoAsOne.twoAsOne(9, 5, 5));

        // Then
        softAssert.assertAll();
    }
}
