public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie Found at position: " + i);
                break; // stop early
            }
        }

        // Result
        if (!found) {
            System.out.println("Bogie not found");
        }

        System.out.println("Search completed.");
    }
}