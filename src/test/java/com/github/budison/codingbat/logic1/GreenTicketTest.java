package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GreenTicketTest {

    @Test
    void testGreenTicket() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(GreenTicket.greenTicket(1, 2, 3), 0);
        softAssert.assertEquals(GreenTicket.greenTicket(3, 2, 1), 0);
        softAssert.assertEquals(GreenTicket.greenTicket(0, 9, 10), 0);
        softAssert.assertEquals(GreenTicket.greenTicket(1, 1, 2), 10);
        softAssert.assertEquals(GreenTicket.greenTicket(2, 1, 1), 10);
        softAssert.assertEquals(GreenTicket.greenTicket(9, 0, 9), 10);
        softAssert.assertEquals(GreenTicket.greenTicket(2, 2, 2), 20);
        softAssert.assertEquals(GreenTicket.greenTicket(0, 0, 0), 20);
        softAssert.assertEquals(GreenTicket.greenTicket(9, 9, 9), 20);

        // Then
        softAssert.assertAll();
    }
}
