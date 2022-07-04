package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CaughtSpeedingTest {
    @Test
    void testCaughtSpeeding() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(CaughtSpeeding.caughtSpeeding(86, true), 2);
        softAssert.assertEquals(CaughtSpeeding.caughtSpeeding(67, true), 1);
        softAssert.assertEquals(CaughtSpeeding.caughtSpeeding(65, true), 0);
        softAssert.assertEquals(CaughtSpeeding.caughtSpeeding(81, false), 2);
        softAssert.assertEquals(CaughtSpeeding.caughtSpeeding(61, false), 1);
        softAssert.assertEquals(CaughtSpeeding.caughtSpeeding(60, false), 0);

        softAssert.assertAll();
    }
}
