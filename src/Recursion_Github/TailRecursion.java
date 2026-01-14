package Recursion_Github;

public class TailRecursion {
    public static void main(String[] args) {
        System.out.println("Starting countdown from 10:");
        countDown(10);

        System.out.println("\nStarting countdown from 3:");
        countDown(3);
    }
    public static void countDown(int n) {
        if (n <= 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }
}
