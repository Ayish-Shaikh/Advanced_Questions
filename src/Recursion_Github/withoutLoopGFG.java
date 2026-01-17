package Recursion_Github;

public class withoutLoopGFG {
    public static void printNos(int n){
        if (n >= 1) {      //checking the number is starting from 1 and then printing the number
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void main(String[] args) {
        printNos(10);
    }
}
