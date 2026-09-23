public class ReverseString {

    public static String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Input: " + input);
        System.out.println("Output: " + reverseString(input));
    }
}
