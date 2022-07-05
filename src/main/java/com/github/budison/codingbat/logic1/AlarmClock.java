package com.github.budison.codingbat.logic1;

abstract class AlarmClock {
    static String alarmClock(int day, boolean vacation) {
        if (!vacation && day != 0 && day != 6) {
            return "7:00";
        }
        if ((day == 0 || day == 6) && vacation) {
            return "off";
        }
        return "10:00";
    }
}
