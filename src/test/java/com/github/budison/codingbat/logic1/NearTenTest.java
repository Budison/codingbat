package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NearTenTest {
    @Test
    void testNearTen() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(NearTen.nearTen(12));
        softAssert.assertTrue(NearTen.nearTen(19));
        softAssert.assertTrue(NearTen.nearTen(31));
        softAssert.assertTrue(NearTen.nearTen(10));
        softAssert.assertTrue(NearTen.nearTen(11));
        softAssert.assertTrue(NearTen.nearTen(21));
        softAssert.assertTrue(NearTen.nearTen(22));
        softAssert.assertTrue(NearTen.nearTen(158));
        softAssert.assertTrue(NearTen.nearTen(1));
        softAssert.assertTrue(NearTen.nearTen(2));
        softAssert.assertFalse(NearTen.nearTen(17));
        softAssert.assertFalse(NearTen.nearTen(6));
        softAssert.assertFalse(NearTen.nearTen(23));
        softAssert.assertFalse(NearTen.nearTen(54));
        softAssert.assertFalse(NearTen.nearTen(155));
        softAssert.assertFalse(NearTen.nearTen(3));
        softAssert.assertFalse(NearTen.nearTen(3));

        // Then
        softAssert.assertAll();
    }
}
