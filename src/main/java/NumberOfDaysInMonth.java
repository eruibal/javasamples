public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year) {
        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) { // step 2
                    if (year % 400 == 0) { //step 3
                        return true;
                    } else return false;
                }  else return true; // step 4
            } else return false; //step 5
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        // Validate the month range
        if (month < 1 || month > 12) {
            return -1;
        }

        // Validate the year range
        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // This case should not be hit due to initial checks
        }

    }
    public static void main(String[] args) {
        System.out.println("Days in February 2024: " + getDaysInMonth(2, 2024)); // Leap Year: 29
        System.out.println("Days in February 2023: " + getDaysInMonth(2, 2023)); // Not Leap Year: 28
        System.out.println("Days in May 2023: " + getDaysInMonth(5, 2023)); // 31
        System.out.println("Invalid Month (13): " + getDaysInMonth(13, 2023)); // -1
        System.out.println("Invalid Year (0): " + getDaysInMonth(5, 0)); // -1
    }


}
