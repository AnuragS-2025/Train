import java.util.Arrays;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogies = new String[n];

        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogies[i] = scanner.nextLine();
        }

        // Sorting using built-in method
        Arrays.sort(bogies);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        scanner.close();
    }
}