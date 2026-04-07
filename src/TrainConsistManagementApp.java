import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates custom exception handling for invalid bogie capacity.
 *
 * @version 14.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("====================================================\n");

        try {
            // VALID bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.type + " | Capacity: " + b1.capacity);

            // INVALID bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created Bogie: " + b2.type + " | Capacity: " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 validation completed...");
    }
}

/**
 * CLASS - PassengerBogie
 */
class PassengerBogie {

    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // VALIDATION (Fail-fast)
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }
}

/**
 * CUSTOM EXCEPTION CLASS
 */
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}