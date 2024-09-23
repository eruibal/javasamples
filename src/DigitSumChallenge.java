import com.sun.source.tree.BreakTree;

public class DigitSumChallenge {

    public static int sumDigits(int number) {

        if (number < 0) return -1;

        int sum = 0;
        // Loop until the number becomes zero
        while (number > 0) {
            // Extract the last digit of the number
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from the number
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1163));
    }


}
