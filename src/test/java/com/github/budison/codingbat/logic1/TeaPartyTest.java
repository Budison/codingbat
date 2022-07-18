package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TeaPartyTest {
    @Test
    void testTeaParty() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(TeaParty.teaParty(3, 8), 0);
        softAssert.assertEquals(TeaParty.teaParty(10, 4), 0);
        softAssert.assertEquals(TeaParty.teaParty(4, 5), 0);

        softAssert.assertEquals(TeaParty.teaParty(6, 8), 1);
        softAssert.assertEquals(TeaParty.teaParty(11, 6), 1);
        softAssert.assertEquals(TeaParty.teaParty(5, 9), 1);

        softAssert.assertEquals(TeaParty.teaParty(20, 6), 2);
        softAssert.assertEquals(TeaParty.teaParty(12, 6), 2);
        softAssert.assertEquals(TeaParty.teaParty(5, 10), 2);

        // Then
        softAssert.assertAll();
    }
}
