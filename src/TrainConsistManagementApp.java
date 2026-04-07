import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        boolean isAdded = train.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate bogie ignored: Sleeper");
        }

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nSystem ready for further operations.");
    }
}