public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
// Manual
// public static String reverseManual(String str) {
//     StringBuilder sb = new StringBuilder();
//     for (int i = str.length() - 1; i >= 0; i--) {
//         sb.append(str.charAt(i));
//     }
//     return sb.toString();
// }