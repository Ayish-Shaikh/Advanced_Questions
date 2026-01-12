package Recursion_Github;

public class RecursionRevision {
    public static void main(String[] args){
        System.out.println(recurison(5));
    }
    public static int recurison(int x){
        if (x == 0) {
            return 0;
        }
        recurison(x-1);
        return x;
    }
}
