public class WhileLoopChallenge {

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        int i = 5;
        int counteven=0;
        int countodd=0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                counteven++;
                System.out.println("even number = " +i);
                if (counteven==5) {
                    System.out.println("Total even " + counteven);
                    System.out.println("Total odd " + countodd);
                    break;
                }
            } else countodd++;
            i++;
        }
    }
}
