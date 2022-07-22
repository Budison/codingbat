package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class In1To10Test {

    @Test
    void testIn1To10() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(In1To10.in1To10(1, false));
        softAssert.assertTrue(In1To10.in1To10(5, false));
        softAssert.assertTrue(In1To10.in1To10(10, false));
        softAssert.assertFalse(In1To10.in1To10(0, false));
        softAssert.assertFalse(In1To10.in1To10(-1, false));
        softAssert.assertFalse(In1To10.in1To10(11, false));
        softAssert.assertTrue(In1To10.in1To10(11, true));
        softAssert.assertTrue(In1To10.in1To10(10, true));
        softAssert.assertTrue(In1To10.in1To10(1, true));
        softAssert.assertTrue(In1To10.in1To10(-1, true));
        softAssert.assertTrue(In1To10.in1To10(0, true));
        softAssert.assertFalse(In1To10.in1To10(3, true));
        softAssert.assertFalse(In1To10.in1To10(9, true));

        // Then
        softAssert.assertAll();
    }
}
