package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CloseFarTest {

    @Test
    void testCloseFar() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(CloseFar.closeFar(1, 2, 10));
        softAssert.assertTrue(CloseFar.closeFar(4, 1, 3));
        softAssert.assertTrue(CloseFar.closeFar(-1, 10, 0));
        softAssert.assertTrue(CloseFar.closeFar(10, 10, 8));

        softAssert.assertFalse(CloseFar.closeFar(1, 2, 3));
        softAssert.assertFalse(CloseFar.closeFar(4, 5, 3));
        softAssert.assertFalse(CloseFar.closeFar(10, 8, 9));
        softAssert.assertFalse(CloseFar.closeFar(5, 5, 5));

        // Then
        softAssert.assertAll();
    }
}
