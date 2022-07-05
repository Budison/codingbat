package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SpecialElevenTest {
    @Test
    void testSpecialEleven() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(SpecialEleven.specialEleven(11), true);
        softAssert.assertEquals(SpecialEleven.specialEleven(22), true);
        softAssert.assertEquals(SpecialEleven.specialEleven(12), true);
        softAssert.assertEquals(SpecialEleven.specialEleven(10), false);
        softAssert.assertEquals(SpecialEleven.specialEleven(21), false);
        softAssert.assertEquals(SpecialEleven.specialEleven(24), false);
        softAssert.assertEquals(SpecialEleven.specialEleven(2), false);
        softAssert.assertEquals(SpecialEleven.specialEleven(1), true);
        softAssert.assertEquals(SpecialEleven.specialEleven(0), true);

        // Then
        softAssert.assertAll();
    }
}
