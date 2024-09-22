public class SumOdd {


   public static int sum = 0;

    public static boolean isOdd(int number) {

        if (number > 0) {

            if (number % 2 == 0)
                return false;
            else return true;

        } else
            return false;

    }

    public static void sumOdd(int start, int end) {

        for (int i=start; i <= end; i++) {

            if (isOdd(i)) {
                sum += i;
            }

        }
    }

    public static void main(String[] args) {
        sumOdd(10, 20);
        System.out.println(sum);
    }
}
