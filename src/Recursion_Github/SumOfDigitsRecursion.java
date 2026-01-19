package Recursion_Github;

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        int a = 531;
        int result = sumofDigits(a);
        System.out.println(result);
    }
    public static int sumofDigits(int n){
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumofDigits(n/10);
    }
}
