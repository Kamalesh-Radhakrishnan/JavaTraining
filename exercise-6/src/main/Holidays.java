package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

class Holidays {
    private int year;

    public Holidays(int year) {
        this.year = year;
    }

    public boolean isHoliday(LocalDate date) {
        if (date.getMonth() == Month.JANUARY && date.getDayOfMonth() == 1) {
            return true;
        }
        if (date.getMonth() == Month.AUGUST && date.getDayOfMonth() == 15) {
            return true;
        }
        if (date.getMonth() == Month.JANUARY && date.getDayOfMonth() == 26) {
            return true;
        }
        if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return true;
        }
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY && (date.getDayOfMonth() == 1 || date.getDayOfMonth() == 2)) {
            return true;
        }
        return false;
    }
}