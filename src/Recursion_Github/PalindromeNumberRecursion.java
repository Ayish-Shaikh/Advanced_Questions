package Recursion_Github;

public class PalindromeNumberRecursion {
    public static void main(String[] args) {
        String test = "abbcbba";
        boolean result = printNo(test, 0, test.length()-1);
        if (result) {
            System.out.println("String: " + test);
            System.out.println("it is a palindrome");
        }else {
            System.out.println("String: " + test);
            System.out.println("not a palindrome");
        }
    }
    public static boolean printNo(String str, int i, int j){
        if (i >= j) {
            return true;
        }
        return (str.charAt(i) == str.charAt(j) && printNo(str, i+1, j-1));
    }
}
