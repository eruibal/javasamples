public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if ((barking) && (hourOfDay < 8 || hourOfDay > 23)) {

            if ((hourOfDay < 0) || (hourOfDay > 23)){
                return false;
            } else return true;
        } else return false;

    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,8));
    }

}
