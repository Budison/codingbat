package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RedTicketTest {

    @Test
    void testRedTicket() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(RedTicket.redTicket(2, 2, 2), 10);
        softAssert.assertEquals(RedTicket.redTicket(0, 0, 0), 5);
        softAssert.assertEquals(RedTicket.redTicket(2, 0, 0), 1);
        softAssert.assertEquals(RedTicket.redTicket(2, 0, 0), 1);
        softAssert.assertEquals(RedTicket.redTicket(2, 2, 1), 0);
        softAssert.assertEquals(RedTicket.redTicket(0, 2, 0), 0);
        softAssert.assertEquals(RedTicket.redTicket(0, 2, 0), 0);

        // Then
        softAssert.assertAll();
    }
}
