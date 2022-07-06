package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class More20Test {
    @Test
    void testMore20() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(More20.more20(21));
        softAssert.assertTrue(More20.more20(22));
        softAssert.assertTrue(More20.more20(41));
        softAssert.assertTrue(More20.more20(42));
        softAssert.assertTrue(More20.more20(1));
        softAssert.assertTrue(More20.more20(2));
        softAssert.assertFalse(More20.more20(20));
        softAssert.assertFalse(More20.more20(40));
        softAssert.assertFalse(More20.more20(0));

        // Then
        softAssert.assertAll();
    }
}
