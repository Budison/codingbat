package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InOrderTest {

    @Test
    void testInOrder() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(InOrder.inOrder(1, 2, 4, false));
        softAssert.assertTrue(InOrder.inOrder(1, 1, 2, true));
        softAssert.assertTrue(InOrder.inOrder(3, 2, 4, true));
        softAssert.assertTrue(InOrder.inOrder(7, 5, 6, true));

        softAssert.assertFalse(InOrder.inOrder(1, 2, 1, false));
        softAssert.assertFalse(InOrder.inOrder(3, 2, 4, false));
        softAssert.assertFalse(InOrder.inOrder(4, 5, 2, true));
        softAssert.assertFalse(InOrder.inOrder(7, 5, 4, true));

        // Then
        softAssert.assertAll();
    }
}
