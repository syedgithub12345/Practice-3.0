import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calling the method to count vowels
        int vowelCount = countVowels(input);

        // Displaying the result
        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();
    }

    // Method to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase for uniformity

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
