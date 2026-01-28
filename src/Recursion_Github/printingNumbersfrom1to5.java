package Recursion_Github;

public class printingNumbersfrom1to5 {
    public static void main(String[] args) {
        printNumbers(5);
    }
    static void printNumbers(int n){
        if (n == 0) return ;
        printNumbers(n - 1);
        System.out.println(n + " ");
    }
}
