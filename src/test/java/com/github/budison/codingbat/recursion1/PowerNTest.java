package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PowerNTest {

    @Test
    void testPowerN() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(PowerN.powerN(3, 1), 3);
        softAssert.assertEquals(PowerN.powerN(3, 2), 9);
        softAssert.assertEquals(PowerN.powerN(3, 3), 27);
        softAssert.assertEquals(PowerN.powerN(2, 5), 32);
        softAssert.assertEquals(PowerN.powerN(10, 3), 1000);

        // Then
        softAssert.assertAll();
    }
}
