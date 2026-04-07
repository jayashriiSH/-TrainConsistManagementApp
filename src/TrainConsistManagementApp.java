import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates adding, removing, and checking passenger bogies
 * using ArrayList operations.
 *
 * @author Developer
 * @version 2.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // DISPLAY after insertion
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE one bogie
        passengerBogies.remove("AC Chair");

        // DISPLAY after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // CHECK existence
        System.out.println("\nChecking if Sleeper exists:");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // FINAL STATE
        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);
    }
}