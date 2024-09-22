public class DayOfWeekPrinter {

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void main(String[] args) {
        for (int day = 0; day <= 7; day++) {
            printDayOfWeek(day);
        }
    }
}