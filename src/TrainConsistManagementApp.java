import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Safety compliance check for goods bogies.
 *
 * @version 12.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("====================================================\n");

        // Create goods bogies
        List<GoodsBogie> goods = new ArrayList<>();

        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Open", "Coal"));
        goods.add(new GoodsBogie("Box", "Grain"));
        goods.add(new GoodsBogie("Cylindrical", "Coal")); // unsafe

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : goods) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // Safety check
        boolean isSafe = goods.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Output
        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}

/**
 * CLASS - GoodsBogie
 */
class GoodsBogie {

    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}