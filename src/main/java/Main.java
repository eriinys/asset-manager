import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Assets newHouse = new House("New", "2025", 400000, 1, 2000, 1000);
//        System.out.printf("How about a new house at the price of $%.2f?%n", newHouse.getValue());
//        System.out.println(newHouse.getCompany());

        ArrayList<Assets> assets = new ArrayList<>();
        assets.add(new House("my house", "2025", 400000, 1, 2000, 1000));
        assets.add(new House("dave's boat", "2020", 600000, 1, 1500, 0));
        assets.add(new Vehicle("my car", "2025", 38000, 60, 2025, "Toyota Rav4"));
        assets.add(new Vehicle("dave's moped", "2021", 12000, 50, 2018, "Honda"));

        for (Assets asset : assets) {
            if (asset instanceof House) {
                System.out.println("House --> ");
            } else if (asset instanceof Vehicle) {
                System.out.println("Vehicle -->");
            }
            asset.display();
        }
    }

}
