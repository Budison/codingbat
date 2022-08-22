package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BlackjackTest {

    @Test
    void testBlackjack() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(Blackjack.blackjack(19, 21), 21);
        softAssert.assertEquals(Blackjack.blackjack(21, 19), 21);
        softAssert.assertEquals(Blackjack.blackjack(19, 19), 19);
        softAssert.assertEquals(Blackjack.blackjack(19, 22), 19);
        softAssert.assertEquals(Blackjack.blackjack(1, 22), 1);
        softAssert.assertEquals(Blackjack.blackjack(0, 22), 0);
        softAssert.assertEquals(Blackjack.blackjack(22, 22), 0);
        softAssert.assertEquals(Blackjack.blackjack(2, 1), 2);

        // Then
        softAssert.assertAll();
    }
}
