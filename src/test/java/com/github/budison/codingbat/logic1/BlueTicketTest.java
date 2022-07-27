package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BlueTicketTest {

    @Test
    void testBlueTicket() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(BlueTicket.blueTicket(9, 1, 0), 10);
        softAssert.assertEquals(BlueTicket.blueTicket(8, 4, 2), 10);
        softAssert.assertEquals(BlueTicket.blueTicket(15, 0, 5), 5);
        softAssert.assertEquals(BlueTicket.blueTicket(13, 2, 3), 5);
        softAssert.assertEquals(BlueTicket.blueTicket(9, 2, 0), 0);
        softAssert.assertEquals(BlueTicket.blueTicket(8, 4, 1), 0);

        // Then
        softAssert.assertAll();
    }
}
