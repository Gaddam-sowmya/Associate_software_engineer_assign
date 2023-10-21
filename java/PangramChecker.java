import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean[] alphabetCheck = new boolean[26];
        input = input.toLowerCase();

        // Iterate through the input and mark the corresponding elements in the boolean array.
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetCheck[ch - 'a'] = true;
            }
        }

        // Check if all elements in the boolean array are true.
        boolean isPangram = true;
        for (boolean letterPresent : alphabetCheck) {
            if (!letterPresent) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}