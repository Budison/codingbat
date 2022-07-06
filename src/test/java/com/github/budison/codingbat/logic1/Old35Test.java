package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Old35Test {
    @Test
    void testOld35() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(Old35.old35(3));
        softAssert.assertTrue(Old35.old35(5));
        softAssert.assertTrue(Old35.old35(9));
        softAssert.assertTrue(Old35.old35(10));
        softAssert.assertFalse(Old35.old35(15));
        softAssert.assertFalse(Old35.old35(30));
        softAssert.assertFalse(Old35.old35(45));
        softAssert.assertFalse(Old35.old35(60));
        softAssert.assertFalse(Old35.old35(0));

        // Then
        softAssert.assertAll();
    }
}
