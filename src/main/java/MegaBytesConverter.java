public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int qtyMb = kiloBytes/1024;
        int remKb = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes+" KB = "+qtyMb+" MB and "+remKb+" KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
