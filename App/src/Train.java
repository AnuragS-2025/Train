public class Train {
    public static void main(String[] args) {

        System.out.println("UC16 - Sort Passenger Bogies by Capacity (Bubble Sort)");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nBefore Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}