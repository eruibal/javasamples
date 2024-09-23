public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalKilos = bigCount*5 + smallCount;

        if (totalKilos < goal) {
            return false;
        } else if ((goal % 5) <= smallCount) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(-3,2,12));
    }
}
