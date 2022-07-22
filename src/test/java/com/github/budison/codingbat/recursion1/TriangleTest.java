package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TriangleTest {

    @Test
    void testTriangle() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(Triangle.triangle(0), 0);
        softAssert.assertEquals(Triangle.triangle(1), 1);
        softAssert.assertEquals(Triangle.triangle(2), 3);
        softAssert.assertEquals(Triangle.triangle(3), 6);
        softAssert.assertEquals(Triangle.triangle(4), 10);
        softAssert.assertEquals(Triangle.triangle(5), 15);

        // Then
        softAssert.assertAll();
    }
}
