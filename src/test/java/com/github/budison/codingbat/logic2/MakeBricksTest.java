package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MakeBricksTest {

    @Test
    void testMakeBricks() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(MakeBricks.makeBricks(3, 1, 8));
        softAssert.assertTrue(MakeBricks.makeBricks(3, 2, 10));
        softAssert.assertTrue(MakeBricks.makeBricks(2, 1, 7));
        softAssert.assertTrue(MakeBricks.makeBricks(40, 2, 50));
        softAssert.assertTrue(MakeBricks.makeBricks(20, 4, 39));

        softAssert.assertFalse(MakeBricks.makeBricks(3, 1, 9));
        softAssert.assertFalse(MakeBricks.makeBricks(1, 4, 12));
        softAssert.assertFalse(MakeBricks.makeBricks(40, 2, 52));
        softAssert.assertFalse(MakeBricks.makeBricks(20, 4, 51));
        softAssert.assertFalse(MakeBricks.makeBricks(20, 0, 21));

        // Then
        softAssert.assertAll();
    }
}
