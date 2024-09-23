public class NumberInWord {

    public static String  printNumberInWord (int number) {

        return switch (number){

            case 0 -> "Zero";
            case 1 -> "One";
            default -> "Invalid";

        };
    }

    public static void main(String[] args) {
        System.out.println(printNumberInWord(10));
    }


}
