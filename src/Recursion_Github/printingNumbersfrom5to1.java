package Recursion_Github;

public class printingNumbersfrom5to1 {
    public static void main(String[] args) {
        printNumberswithoutLoops(5);
    }
    static void printNumberswithoutLoops(int n){
        if (n == 0) return ;
        System.out.println(n + " ");
        printNumberswithoutLoops(n - 1);
    }
}
