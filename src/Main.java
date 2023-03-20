import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Prints a divider.
        System.out.println("================================");

        try {
            // Scans the input.
            for (int i = 0; i < 3; i++) {
                // Scans a token.
                String sc1 = scanner.next();

                // Scans a whole number.
                int x = scanner.nextInt();

                // Prints out the formatted String.
                System.out.println(getRow(x, sc1));
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a whole number.");
        } finally {
            // Closes the scanner.
            scanner.close();
        }

        // Prints a divider.
        System.out.println("================================");
    }

    /**
     * Forms a String that follows these rules:
     * <ul>
     *     <li>The first column contains the String and is left justified using exactly 15 characters.</li>
     *     <li>The second column contains the integer, expressed in exactly digits; if the original input has less than
     *     three digits, it is padded with leading zeroes.</li>
     * </ul>
     * <p>
     *
     * @param number is between 0 and 999 (inclusive).
     * @param input  is the user input String.
     * @return Formatted String with two columns.
     */
    private static String getRow(int number, String input) {
        String secondColumn = input + " ".repeat(15 - input.length());
        if (number < 10) {
            return secondColumn.concat("00").concat(String.valueOf(number));
        } else if (number < 100) {
            return secondColumn.concat("0").concat(String.valueOf(number));
        } else {
            return secondColumn.concat(String.valueOf(number));
        }
    }
}
