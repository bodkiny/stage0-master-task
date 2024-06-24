package com.epam.conditions;

public class DaysInMonth {

    private static final int THIRTY_ONE_DAY_MONTH = 31;
    private static final int THIRTY_DAY_MONTH = 30;

    public void printDays(int year, int month) {
        if (year < 0 || (month < 1 || month > 12)) {
            System.out.println("invalid date");
            return;
        }

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> THIRTY_ONE_DAY_MONTH;
            case 2 -> yearIsLeap(year) ? 29 : 28;
            case 4, 6, 9, 11 -> THIRTY_DAY_MONTH;
            default -> -1;
        };

        System.out.println(days);
    }

    private boolean yearIsLeap(int year) {
        boolean isMultipleOf100 = year % 100 == 0;
        boolean isMultipleOf400 = year % 400 == 0;
        boolean isMultipleOf4 = year % 4 == 0;

        if (isMultipleOf100) return isMultipleOf400;
        else return isMultipleOf4;
    }

}
