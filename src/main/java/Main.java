public class Main {
    public static void main(String[] args) {
        Assets newHouse = new House("New", "2025", 400000, 1, 2000, 1000);
        System.out.printf("How about a new house at the price of $%.2f?", newHouse.getValue());
    }
}
