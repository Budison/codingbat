package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlarmClockTest {
    @Test
    public void testAlarmClock() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(AlarmClock.alarmClock(0, false), "10:00");
        softAssert.assertEquals(AlarmClock.alarmClock(0, true), "off");
        softAssert.assertEquals(AlarmClock.alarmClock(6, false), "10:00");
        softAssert.assertEquals(AlarmClock.alarmClock(6, true), "off");
        softAssert.assertEquals(AlarmClock.alarmClock(1, false), "7:00");
        softAssert.assertEquals(AlarmClock.alarmClock(1, true), "10:00");
        softAssert.assertEquals(AlarmClock.alarmClock(2, false), "7:00");
        softAssert.assertEquals(AlarmClock.alarmClock(3, false), "7:00");
        softAssert.assertEquals(AlarmClock.alarmClock(4, false), "7:00");
        softAssert.assertEquals(AlarmClock.alarmClock(5, false), "7:00");

        // Then
        softAssert.assertAll();
    }
}
