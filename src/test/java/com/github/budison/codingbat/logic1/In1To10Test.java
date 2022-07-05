package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class In1To10Test {
    @Test
    void testIn1To10() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(In1To10.in1To10(1, false), true);
        softAssert.assertEquals(In1To10.in1To10(5, false), true);
        softAssert.assertEquals(In1To10.in1To10(10, false), true);
        softAssert.assertEquals(In1To10.in1To10(0, false), false);
        softAssert.assertEquals(In1To10.in1To10(-1, false), false);
        softAssert.assertEquals(In1To10.in1To10(11, false), false);
        softAssert.assertEquals(In1To10.in1To10(11, true), true);
        softAssert.assertEquals(In1To10.in1To10(10, true), true);
        softAssert.assertEquals(In1To10.in1To10(1, true), true);
        softAssert.assertEquals(In1To10.in1To10(-1, true), true);
        softAssert.assertEquals(In1To10.in1To10(0, true), true);
        softAssert.assertEquals(In1To10.in1To10(3, true), false);
        softAssert.assertEquals(In1To10.in1To10(9, true), false);

        // Then
        softAssert.assertAll();
    }
}
