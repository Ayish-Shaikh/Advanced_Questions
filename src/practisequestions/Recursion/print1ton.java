package practisequestions.Recursion;

public class print1ton {
    static void print12N(int i, int n){
        if (i > n) return;

        System.out.println(i);
        print12N(i + 1, n);
    }

    public static void main(String[] args) {
        print12N(1, 5);
    }
}
