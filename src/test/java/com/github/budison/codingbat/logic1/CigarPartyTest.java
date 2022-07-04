package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CigarPartyTest {
    @Test
    void testCigarParty() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(CigarParty.cigarParty(50, true), true);
        softAssert.assertEquals(CigarParty.cigarParty(39, true), false);
        softAssert.assertEquals(CigarParty.cigarParty(41, false), true);
        softAssert.assertEquals(CigarParty.cigarParty(59, false), true);
        softAssert.assertEquals(CigarParty.cigarParty(61, false), false);

        softAssert.assertAll();
    }
}
