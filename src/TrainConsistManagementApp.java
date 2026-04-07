import java.util.*;

<<<<<<< HEAD
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
=======
>>>>>>> feature/UC19
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================================\n");

<<<<<<< HEAD
        // Unsorted array (will be sorted first)
=======
>>>>>>> feature/UC19
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        String searchKey = "BG205";

<<<<<<< HEAD
        // SORT first (important precondition)
=======
>>>>>>> feature/UC19
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.println("\nSearching for Bogie ID: " + searchKey + "\n");

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID found in the train consist.");
        } else {
            System.out.println("Bogie ID NOT found in the train consist.");
        }

        System.out.println("\nUC19 search completed...");
    }

<<<<<<< HEAD
    // BINARY SEARCH METHOD
=======
>>>>>>> feature/UC19
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
<<<<<<< HEAD
                return true; // found
            } else if (cmp < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
=======
                return true;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
>>>>>>> feature/UC19
    }
}