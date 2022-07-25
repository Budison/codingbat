package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LessBy10Test {

    @Test
    void testLessBy10() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(LessBy10.lessBy10(1, 7, 11));
        softAssert.assertTrue(LessBy10.lessBy10(-10, 2, 2));
        softAssert.assertTrue(LessBy10.lessBy10(10, 11, 1));
        softAssert.assertTrue(LessBy10.lessBy10(2, 8, 12));

        softAssert.assertFalse(LessBy10.lessBy10(1, 7, 10));
        softAssert.assertFalse(LessBy10.lessBy10(10, 7, 1));
        softAssert.assertFalse(LessBy10.lessBy10(3, 3, 3));
        softAssert.assertFalse(LessBy10.lessBy10(10, 11, 2));

        // Then
        softAssert.assertAll();
    }
}
