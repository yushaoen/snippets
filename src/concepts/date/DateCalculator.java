package concepts.date;

/**
 * @author yushaoen
 */
public class DateCalculator {
    public static String findDate(int year, int dayOfYear) throws Exception {

        if (dayOfYear == 0) {
            throw new IllegalArgumentException("dayOfYear cannot be 0");
        }

        if (dayOfYear > (isLeapYear(year) ? 366 : 365)) {
            throw new IllegalArgumentException(String.format("dayOfYear cannot be > %d. Found: %d",
                                                             isLeapYear(year) ? 366 : 365,
                                                             dayOfYear));
        }

        int month = 1, day = dayOfYear;

        for (int i = 0; i < 12; i++) {
            int daysInMonth = daysOfMonth(year, month);

            if (day - daysInMonth <= 0) {
                break;
            } else {
                month++;
                day = day - daysInMonth;
            }
        }

        return new Date(month, day).toString();
    }

    private static int daysOfMonth(int year, int month) throws Exception {
        if (month < 1) {
            throw new IllegalArgumentException("Month cannot be < 1");
        }

        int februaryDays = isLeapYear(year) ? 29 : 28;
        return (month == 2) ? februaryDays : maxMonthDays[month];
    }

    /**
     * Verify if a year is a Leap year
     * <p>
     * Pseudo Algorithm:
     * if (year is not exactly divisible by 4) then (it is a common year)
     * else
     * if (year is not exactly divisible by 100) then (it is a leap year)
     * else
     * if (year is not exactly divisible by 400) then (it is a common year)
     * else (it is a leap year)
     *
     * @param year {int}
     * @return {boolean} true if the year is a Leap year
     */
    public static boolean isLeapYear(int year) {
        // easier to check if it's a common year, negative the result to
        // check for leap year
        return year % 4 == 0 && (year % 100 > 0 || year % 400 == 0);
    }

    private final static int[] maxMonthDays = new int[]{
            -1, // DONT_USE
            31, // January
            29, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
    };

    private final static String[] Month = new String[]{
            "", // DONT_USE
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    public static class Date {
        private final int month;
        private final int day;

        public Date(int month, int day) throws Exception {

            if (month > 12) {
                throw new IllegalArgumentException("Month cannot be > 12");
            }

            if (day > maxMonthDays[month]) {
                throw new IllegalArgumentException(String.format("Day cannot be > %d for Month = %d. Found: %d",
                                                                 maxMonthDays[day], month, day));
            }

            this.month = month;
            this.day = day;
        }

        public String toString() {
            return String.format("%s %d", Month[month], day);
        }
    }
}
