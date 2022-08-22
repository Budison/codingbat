package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MakeChocolateTest {

    @Test
    void testMakeChocolate() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(MakeChocolate.makeChocolate(4, 1, 9), 4);
        softAssert.assertEquals(MakeChocolate.makeChocolate(4, 1, 10), -1);
        softAssert.assertEquals(MakeChocolate.makeChocolate(4, 1, 7), 2);
        softAssert.assertEquals(MakeChocolate.makeChocolate(4, 1, 5), 0);
        softAssert.assertEquals(MakeChocolate.makeChocolate(3, 1, 9), -1);
        softAssert.assertEquals(MakeChocolate.makeChocolate(6, 1, 12), -1);
        softAssert.assertEquals(MakeChocolate.makeChocolate(6, 2, 10), 0);
        softAssert.assertEquals(MakeChocolate.makeChocolate(0, 0, 0), 0);
        softAssert.assertEquals(MakeChocolate.makeChocolate(60, 100, 550), 50);

        // Then
        softAssert.assertAll();
    }
}
