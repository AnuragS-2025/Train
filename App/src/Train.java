import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Train {
    public static void main(String[] args) {

        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        b.type.equals("Cylindrical") ? b.cargo.equals("Petroleum") : true
                );

        System.out.println("\nSafety Compliance Result:");
        System.out.println("Is Train Safe? : " + isSafe);

        System.out.println("\nUC12 safety validation completed...");
    }
}