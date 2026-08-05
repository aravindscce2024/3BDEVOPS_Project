public class StringReversal {

    // Static method that takes a string and returns its reverse
    public static String reverseString(String input) {
        if (input == null) {
            return null; // Handle null input to avoid NullPointerException
        }
        // Use StringBuilder's built-in reverse method for top efficiency
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello World";
        
        // Calling the static method directly without creating an object
        String reversed = reverseString(original);
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
