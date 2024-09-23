public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int convNum1 = (int)(num1 * 1000);
        int convNum2 = (int)(num2 * 1000);

        System.out.println(convNum1+" "+convNum2);

        if (convNum1 == convNum2)
            return true;
        else return false;

    }

    public static void main(String[] args) {;
        System.out.println(areEqualByThreeDecimalPlaces(3.45678,3.4569));
    }


}
