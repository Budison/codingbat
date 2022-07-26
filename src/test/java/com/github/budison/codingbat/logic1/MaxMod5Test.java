package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MaxMod5Test {

    @Test
    void testMaxMod5() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(MaxMod5.maxMod5(2, 3), 3);
        softAssert.assertEquals(MaxMod5.maxMod5(6, 2), 6);
        softAssert.assertEquals(MaxMod5.maxMod5(8, 12), 12);
        softAssert.assertEquals(MaxMod5.maxMod5(7, 12), 7);
        softAssert.assertEquals(MaxMod5.maxMod5(11, 6), 6);
        softAssert.assertEquals(MaxMod5.maxMod5(2, 7), 2);
        softAssert.assertEquals(MaxMod5.maxMod5(7, 7), 0);
        softAssert.assertEquals(MaxMod5.maxMod5(9, 14), 9);

        // Then
        softAssert.assertAll();
    }
}
