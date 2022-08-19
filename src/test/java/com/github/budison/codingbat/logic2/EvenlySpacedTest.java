package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EvenlySpacedTest {

    @Test
    void testEvenlySpaced() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(EvenlySpaced.evenlySpaced(2, 4, 6));
        softAssert.assertTrue(EvenlySpaced.evenlySpaced(6, 4, 2));
        softAssert.assertTrue(EvenlySpaced.evenlySpaced(5, 15, 10));
        softAssert.assertTrue(EvenlySpaced.evenlySpaced(5, 15, 10));
        softAssert.assertTrue(EvenlySpaced.evenlySpaced(2, 2, 2));

        softAssert.assertFalse(EvenlySpaced.evenlySpaced(4, 6, 3));
        softAssert.assertFalse(EvenlySpaced.evenlySpaced(6, 2, 8));
        softAssert.assertFalse(EvenlySpaced.evenlySpaced(10, 9, 9));
        softAssert.assertFalse(EvenlySpaced.evenlySpaced(3, 6, 12));
        softAssert.assertFalse(EvenlySpaced.evenlySpaced(12, 3, 6));

        // Then
        softAssert.assertAll();
    }
}