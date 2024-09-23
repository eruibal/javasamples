public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
//        if (first < 10 || second < 10) {
//            return -1; // Invalid value
//        }
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(5,10));
    }
}
