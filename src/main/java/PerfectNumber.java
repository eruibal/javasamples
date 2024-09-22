public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
   }

    public static void main(String[] args) {
        int number = 6; // Example number
        System.out.println("Thi is a perfect number " + number + " is: " + isPerfectNumber(number));
    }
}


