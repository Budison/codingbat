package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShareDigitTest {

    @Test
    void testShareDigit() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(ShareDigit.shareDigit(12, 23));
        softAssert.assertTrue(ShareDigit.shareDigit(30, 90));
        softAssert.assertTrue(ShareDigit.shareDigit(55, 55));

        softAssert.assertFalse(ShareDigit.shareDigit(12, 43));
        softAssert.assertFalse(ShareDigit.shareDigit(23, 19));
        softAssert.assertFalse(ShareDigit.shareDigit(55, 44));

        // Then
        softAssert.assertAll();
    }
}
