public class Main {
    public static void main(String[] args) {
        // Example usage
        Floor roomFloor = new Floor(5.5, 8.0);
        Carpet roomCarpet = new Carpet(20.0);

        Calculator roomCalculator = new Calculator(roomFloor, roomCarpet);

        double totalCost = roomCalculator.getTotalCost();

        System.out.println("Total cost for carpeting: $" + totalCost);
    }
}