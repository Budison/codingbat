package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnswerCellTest {

    @Test
    void testAnswerCell() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(AnswerCell.answerCell(false, false, false));
        softAssert.assertTrue(AnswerCell.answerCell(true, true, false));
        softAssert.assertTrue(AnswerCell.answerCell(false, true, false));

        softAssert.assertFalse(AnswerCell.answerCell(false, false, true));
        softAssert.assertFalse(AnswerCell.answerCell(true, false, false));
        softAssert.assertFalse(AnswerCell.answerCell(true, true, true));

        // Then
        softAssert.assertAll();
    }
}
