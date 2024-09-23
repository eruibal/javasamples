public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1; // Return -1 for invalid values
        }

        int largestPrime = -1;

        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides number, update largestPrime and divide number
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(42));
    }
}
