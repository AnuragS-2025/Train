import java.util.Scanner;
import java.util.regex.Pattern;

public class Train {
    public static void main(String[] args) {

        System.out.println("UC11 - Validate Train ID & Cargo Code");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        boolean isTrainValid = trainPattern.matcher(trainId).matches();
        boolean isCargoValid = cargoPattern.matcher(cargoCode).matches();

        System.out.println("\nValidation Results:");

        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}