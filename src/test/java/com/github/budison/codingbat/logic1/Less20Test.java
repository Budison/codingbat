package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Less20Test {

    @Test
    void testLess20() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(Less20.less20(18));
        softAssert.assertTrue(Less20.less20(19));
        softAssert.assertTrue(Less20.less20(58));
        softAssert.assertTrue(Less20.less20(59));
        softAssert.assertTrue(Less20.less20(1018));
        softAssert.assertTrue(Less20.less20(1019));
        softAssert.assertFalse(Less20.less20(20));
        softAssert.assertFalse(Less20.less20(8));
        softAssert.assertFalse(Less20.less20(17));
        softAssert.assertFalse(Less20.less20(23));
        softAssert.assertFalse(Less20.less20(25));
        softAssert.assertFalse(Less20.less20(30));
        softAssert.assertFalse(Less20.less20(31));
        softAssert.assertFalse(Less20.less20(60));
        softAssert.assertFalse(Less20.less20(61));
        softAssert.assertFalse(Less20.less20(1022));
        softAssert.assertFalse(Less20.less20(1023));
        softAssert.assertFalse(Less20.less20(37));

        // Then
        softAssert.assertAll();
    }
}
