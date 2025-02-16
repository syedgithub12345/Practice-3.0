public class stringoperations {
    public static void main(String[] args) {
        String input = "Hello World";

        performStringOperations(input);
    }

    public static void performStringOperations(String str) {
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + new StringBuilder(str).reverse());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Length: " + str.length());
        System.out.println("First Character: " + str.charAt(0));
        System.out.println("Last Character: " + str.charAt(str.length() - 1));
        System.out.println("Contains 'World'? " + str.contains("World"));
        System.out.println("Replaced 'World' with 'Java': " + str.replace("World", "Java"));
    }
}
