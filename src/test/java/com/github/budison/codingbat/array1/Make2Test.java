package com.github.budison.codingbat.array1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Make2Test {
    
    @Test
    void testMake2() {
        // Given
        SoftAssert softAssert = new SoftAssert();
        
        // When
        softAssert.assertEquals(Make2.make2(new int[] {4, 5}, new int[] {1, 2, 3}), new int[] {4, 5});
        softAssert.assertEquals(Make2.make2(new int[] {4}, new int[] {1, 2, 3}), new int[] {4, 1});
        softAssert.assertEquals(Make2.make2(new int[] {}, new int[] {1, 2}), new int[] {1, 2});
        softAssert.assertEquals(Make2.make2(new int[] {1, 2}, new int[] {}), new int[] {1, 2});
        softAssert.assertEquals(Make2.make2(new int[] {1}, new int[] {1}), new int[] {1, 1});

        // Then
        softAssert.assertAll();
    }
}
