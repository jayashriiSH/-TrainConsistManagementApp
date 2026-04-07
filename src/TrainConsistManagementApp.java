import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates maintaining insertion order with uniqueness
 * using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create LinkedHashSet for train formation
        Set<String> formation = new LinkedHashSet<>();

        // ADD bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ADD duplicate intentionally
        formation.add("Sleeper"); // ignored

        // DISPLAY formation
        System.out.println("Train Formation:");
        System.out.println(formation);
    }
}