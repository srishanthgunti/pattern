public class pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part of the diamond
        for (int ii = n - 1; ii > 0; ii--) { // Correct loop variable
            for (int j = 1; j <= n - ii; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * ii - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
