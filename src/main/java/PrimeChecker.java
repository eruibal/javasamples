public class PrimeChecker {
    public static boolean isPrime(int wholeNumber) {
        // If the number is less than 2, it is not prime
        if (wholeNumber < 2) {
            return false;
        }

        // Check for divisibility by numbers from 2 to the square root of the wholeNumber
        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0) { // If divisible, it's not prime
                return false;
            }
        }

        // If no divisors other than 1 and itself, it's prime
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
}

