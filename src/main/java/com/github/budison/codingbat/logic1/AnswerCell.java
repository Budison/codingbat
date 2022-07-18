package com.github.budison.codingbat.logic1;

abstract class AnswerCell {
    static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (isMorning) {
            return isMom;
        } else {
            return true;
        }
    }
}
