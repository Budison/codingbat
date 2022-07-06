package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SpecialElevenTest {
    @Test
    void testSpecialEleven() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(SpecialEleven.specialEleven(11));
        softAssert.assertTrue(SpecialEleven.specialEleven(22));
        softAssert.assertTrue(SpecialEleven.specialEleven(12));
        softAssert.assertFalse(SpecialEleven.specialEleven(10));
        softAssert.assertFalse(SpecialEleven.specialEleven(21));
        softAssert.assertFalse(SpecialEleven.specialEleven(24));
        softAssert.assertFalse(SpecialEleven.specialEleven(2));
        softAssert.assertTrue(SpecialEleven.specialEleven(1));
        softAssert.assertTrue(SpecialEleven.specialEleven(0));

        // Then
        softAssert.assertAll();
    }
}
