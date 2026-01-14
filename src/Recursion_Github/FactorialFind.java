package Recursion_Github;

public class FactorialFind {
    public static void main(String[] args) {
        System.out.println("finding the factorial of a given number: " + factorialFind(5));
    }
        public static int factorialFind ( int n){
            if (n == 1) {
                return 1;
            }
            System.out.println(n);
            return n * factorialFind(n - 1);
        }
    }