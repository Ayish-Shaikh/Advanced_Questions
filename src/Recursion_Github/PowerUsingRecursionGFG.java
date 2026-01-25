package Recursion_Github;

public class PowerUsingRecursionGFG {
    static int RecursivePower(int n, int p) {
        if (p == 0){
            return 1;
        }
        return n * RecursivePower(n, p - 1);
    }

    public static void main(String[] args) {
        int result = RecursivePower(2,5);
        System.out.println(result);
    }
}
