import java.util.Scanner;

class pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the number of rows as input
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = sc.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {

            // Print spaces first
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Then print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close();
    }
}
