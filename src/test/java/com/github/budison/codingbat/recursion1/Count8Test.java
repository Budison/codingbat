package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Count8Test {

    @Test
    void testCount8() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(Count8.count8(8), 1);
        softAssert.assertEquals(Count8.count8(818), 2);
        softAssert.assertEquals(Count8.count8(8818), 4);
        softAssert.assertEquals(Count8.count8(8088), 4);
        softAssert.assertEquals(Count8.count8(123), 0);
        softAssert.assertEquals(Count8.count8(88888), 9);
        softAssert.assertEquals(Count8.count8(77778), 1);
        softAssert.assertEquals(Count8.count8(777788), 3);

        // Then
        softAssert.assertAll();
    }
}
