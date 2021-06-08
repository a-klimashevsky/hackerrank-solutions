package toptal.iii;

/**
 * Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
 * January, February, March, April, May, June, July, August, September, October, November, December
 */
public class Solution {

    static int Monday = 0;
    static int Tuesday = 1;
    static int Wednesday = 2;
    static int Thursday = 3;
    static int Friday = 4;
    static int Saturday = 5;
    static int Sunday = 6;

    static int January = 0;
    static int February = 1;
    static int March = 2;
    static int April = 3;
    static int May = 4;
    static int June = 5;
    static int July = 6;
    static int August = 7;
    static int September = 8;
    static int October = 9;
    static int November = 10;
    static int December = 11;

    public int solution(int Y, String A, String B, String W) {
        int startMonth = month(A);
        int endMonth = month(B);
        int yearDay = day(W);

        int days = daysBetween(startMonth, endMonth, Y);
        int startDayOf = startDayOf(Y, startMonth, yearDay);
        if (startDayOf != 0) {
            days -= (7 - startDayOf);
        }
        return days / 7;
    }

    int daysBetween(int startMonth, int endMonth, int year) {
        int days = 0;
        for (int i = startMonth; i <= endMonth; i++) {
            days += lengthOfMonth(year, i);
        }
        return days;
    }

    private int endDayOf(int year, int endMonth, int yearDay) {
        return 0;
    }

    private int startDayOf(int year, int startMonth, int yearDay) {
        int daysBefore = 0;
        for (int i = 0; i < startMonth; i++) {
            daysBefore += lengthOfMonth(year, i);
        }
        daysBefore += yearDay;

        return daysBefore % 7;
    }

    int day(String name) {
        switch (name) {
            case "Monday":
                return Monday;
            case "Tuesday":
                return Tuesday;
            case "Wednesday":
                return Wednesday;
            case "Thursday":
                return Thursday;
            case "Friday":
                return Friday;
            case "Saturday":
                return Saturday;
            case "Sunday":
                return Sunday;
            default:
                throw new IllegalArgumentException("Unknown day");
        }
    }

    int month(String name) {
        switch (name) {
            case "January":
                return January;
            case "February":
                return February;
            case "March":
                return March;
            case "April":
                return April;
            case "May":
                return May;
            case "June":
                return June;
            case "July":
                return July;
            case "August":
                return August;
            case "September":
                return September;
            case "October":
                return October;
            case "November":
                return November;
            case "December":
                return December;
            default:
                throw new IllegalArgumentException("Unknown month");
        }
    }

    int lengthOfMonth(int year, int month) {
        if (year % 4 == 0 && month == February) {
            return 29;
        }
        if (month == February) {
            return 28;
        }
        if (month == January ||
                month == March ||
                month == May ||
                month == July ||
                month == August ||
                month == October ||
                month == December) {
            return 31;
        }
        return 30;
    }
}
