package Recursion_Github;

public class RopeCuttingRecursion {
    public static void main(String[] args) {
        int rope = 42;
        int a = 15;
        int b = 12;
        int c = 11;
        int maxpieces = ropecut(rope, a, b, c);
        if (maxpieces != -1) {
            System.out.println("Maximum pieces possible: " + maxpieces);
        } else {
            System.out.println("Not valid " + maxpieces);
        }
    }

    public static int ropecut(int rope, int a, int b, int c) {
        if (rope == 0) {
            return 0;
        }
        if (rope < 0) {
            return -1;
        }
        int cutA = ropecut(rope - a, a, b, c);
        int cutB = ropecut(rope - b, a, b, c);
        int cutC = ropecut(rope - c, a, b, c);

        int result = Math.max(cutA, Math.max(cutB, cutC));
        if (result == -1) {
            return -1;
        }
        return result + 1;
    }
}
