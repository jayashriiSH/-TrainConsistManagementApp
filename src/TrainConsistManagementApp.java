import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates unique bogie ID tracking using HashSet.
 *
 * @author Developer
 * @version 3.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ADD bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // DISPLAY unique bogies
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}