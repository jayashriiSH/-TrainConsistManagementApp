import java.util.*;
import java.util.stream.Collectors;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates grouping bogies by type using Stream API.
 *
 * @author Developer
 * @version 9.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));   // duplicate type
        bogies.add(new Bogie("First Class", 24));

        // GROUP by bogie type
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // DISPLAY grouped data
        System.out.println("Grouped Bogies:\n");

        for (String type : grouped.keySet()) {
            System.out.println(type + ":");

            for (Bogie b : grouped.get(type)) {
                System.out.println("  Capacity: " + b.capacity);
            }
        }
    }
}

/**
 * CLASS - Bogie
 */
class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}