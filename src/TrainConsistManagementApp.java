import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates mapping bogies to their capacities using HashMap.
 *
 * @author Developer
 * @version 6.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ADD mappings
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // DISPLAY mapping
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey()
                    + " | Capacity: " + entry.getValue());
        }
    }
}