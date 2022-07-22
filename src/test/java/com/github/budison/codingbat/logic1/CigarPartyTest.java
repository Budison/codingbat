package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CigarPartyTest {

    @Test
    void testCigarParty() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(CigarParty.cigarParty(50, true));
        softAssert.assertFalse(CigarParty.cigarParty(39, true));
        softAssert.assertTrue(CigarParty.cigarParty(41, false));
        softAssert.assertTrue(CigarParty.cigarParty(59, false));
        softAssert.assertFalse(CigarParty.cigarParty(61, false));

        // Then
        softAssert.assertAll();
    }
}
