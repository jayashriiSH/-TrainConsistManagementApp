import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates Binary Search for bogie ID.
 *
 * @version 19.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================================\n");

        // Unsorted array (will be sorted first)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        String searchKey = "BG205";

        // SORT first (important precondition)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.println("\nSearching for Bogie ID: " + searchKey + "\n");

        boolean found = binarySearch(bogieIds, searchKey);

        // OUTPUT
        if (found) {
            System.out.println("Bogie ID found in the train consist.");
        } else {
            System.out.println("Bogie ID NOT found in the train consist.");
        }

        System.out.println("\nUC19 search completed...");
    }

    // BINARY SEARCH METHOD
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }
}