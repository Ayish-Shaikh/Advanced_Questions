package Recursion_Github;

public class printsHello5times {
    public static void main(String[] args) {
        int a = printHello(5);
        System.out.println("how many times does the hello appeared: " + a);
    }
    public static int printHello(int n){
        if (n == 0)return 0;
        System.out.println("Hello");
        printHello(n -1);
        return n;
    }
}
