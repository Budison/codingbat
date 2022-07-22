package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Count7Test {

    @Test
    void testCount7() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(Count7.count7(0), 0);
        softAssert.assertEquals(Count7.count7(7), 1);
        softAssert.assertEquals(Count7.count7(4), 0);
        softAssert.assertEquals(Count7.count7(17), 1);
        softAssert.assertEquals(Count7.count7(23), 0);
        softAssert.assertEquals(Count7.count7(77), 2);
        softAssert.assertEquals(Count7.count7(770), 2);
        softAssert.assertEquals(Count7.count7(1234), 0);
        softAssert.assertEquals(Count7.count7(7172737), 4);

        // Then
        softAssert.assertAll();
    }
}
