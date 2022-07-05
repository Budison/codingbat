package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Love6Test {
    @Test
    public void testLove6() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(Love6.love6(1, 5), true);
        softAssert.assertEquals(Love6.love6(0, 5), false);
        softAssert.assertEquals(Love6.love6(1, 7), true);
        softAssert.assertEquals(Love6.love6(16, 10), true);
        softAssert.assertEquals(Love6.love6(26, 10), false);
        softAssert.assertEquals(Love6.love6(-6, 0), true);

        // Then
        softAssert.assertAll();
    }
}
