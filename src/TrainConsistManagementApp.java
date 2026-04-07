/**
 * ============================================================
 * MAIN CLASS - TrainConsistApp
 * ============================================================
 *
 * Description:
 * Entry point of the Train Consist Management System.
 * Initializes train consist and displays initial state.
 *
 * @author Developer
 * @version 1.0
 */
import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Initialize empty consist (dynamic list)
        List<String> consist = new ArrayList<>();

        // Display initial state
        System.out.println("Train initialized successfully.");
        System.out.println("Current number of bogies: " + consist.size());
    }
}