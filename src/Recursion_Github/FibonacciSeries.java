package Recursion_Github;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("finding the fibonacci series of a given number: " + fibonacci(7));
    }

    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
