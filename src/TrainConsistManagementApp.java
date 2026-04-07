import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempt to add duplicate
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Duplicate bogie ID detected: BG101 (Not Added)");
        }

        // Display all bogie IDs
        System.out.println("\nBogie IDs in Train:");
        System.out.println(bogieIds);

        // Check existence
        if (bogieIds.contains("BG102")) {
            System.out.println("\nBG102 exists in the train.");
        }

        System.out.println("\nSystem ready for further operations.");
    }
}