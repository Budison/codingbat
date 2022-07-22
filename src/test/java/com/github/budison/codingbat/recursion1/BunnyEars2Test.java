package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BunnyEars2Test {
    
    @Test
    void testBunnyEars2() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(BunnyEars2.bunnyEars2(0), 0);
        softAssert.assertEquals(BunnyEars2.bunnyEars2(1), 2);
        softAssert.assertEquals(BunnyEars2.bunnyEars2(2), 5);
        softAssert.assertEquals(BunnyEars2.bunnyEars2(3), 7);
        softAssert.assertEquals(BunnyEars2.bunnyEars2(4), 10);
        softAssert.assertEquals(BunnyEars2.bunnyEars2(5), 12);
        softAssert.assertEquals(BunnyEars2.bunnyEars2(6), 15);
        softAssert.assertEquals(BunnyEars2.bunnyEars2(10), 25);

        // Then
        softAssert.assertAll();
    }
}
