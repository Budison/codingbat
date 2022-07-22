package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BunnyEarsTest {
    
    @Test
    void testBunnyEars() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(BunnyEars.bunnyEars(0), 0);
        softAssert.assertEquals(BunnyEars.bunnyEars(1), 2);
        softAssert.assertEquals(BunnyEars.bunnyEars(2), 4);
        softAssert.assertEquals(BunnyEars.bunnyEars(3), 6);
        softAssert.assertEquals(BunnyEars.bunnyEars(4), 8);
        softAssert.assertEquals(BunnyEars.bunnyEars(234), 468);

        // Then
        softAssert.assertAll();
    }
}
