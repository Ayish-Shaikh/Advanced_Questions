package practisequestions.Recursion;

public class printntimes {
    static void printName(String name, int n){
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printName(name, n-1);
    }

    public static void main(String[] args) {
        String name = "Ayish";
        int n = 5;
        printName(name, n);
    }
}
