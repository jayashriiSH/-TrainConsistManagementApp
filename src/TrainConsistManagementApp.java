import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates sorting bogies based on capacity using Comparator.
 *
 * @author Developer
 * @version 7.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // ADD bogie objects
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // SORT using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // DISPLAY sorted bogies
        System.out.println("Bogies sorted by capacity:\n");

        for (Bogie b : bogies) {
            System.out.println("Bogie: " + b.name +
                    " | Capacity: " + b.capacity);
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