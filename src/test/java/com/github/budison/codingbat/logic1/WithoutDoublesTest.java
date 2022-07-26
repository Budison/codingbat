package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WithoutDoublesTest {

    @Test
    void testWithoutDoubles() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(WithoutDoubles.withoutDoubles(2, 3, true), 5);
        softAssert.assertEquals(WithoutDoubles.withoutDoubles(3, 3, true), 7);
        softAssert.assertEquals(WithoutDoubles.withoutDoubles(3, 3, false), 6);
        softAssert.assertEquals(WithoutDoubles.withoutDoubles(1, 6, true), 7);
        softAssert.assertEquals(WithoutDoubles.withoutDoubles(6, 6, true), 7);
        softAssert.assertEquals(WithoutDoubles.withoutDoubles(6, 6, false), 12);

        // Then
        softAssert.assertAll();
    }
}
