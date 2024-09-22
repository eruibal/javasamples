public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Invalid value
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }
}
