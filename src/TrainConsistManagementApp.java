import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> goods = new ArrayList<>();

        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Box", "Coal"));
        goods.add(new GoodsBogie("Open", "Grain"));

        boolean isSafe = goods.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true; // other bogies allowed
                });

        if (isSafe) {
            System.out.println("\nTrain is SAFE for operation.");
        } else {
            System.out.println("\nTrain is NOT SAFE!");
        }

        System.out.println("\nSystem ready for further operations.");
    }
}