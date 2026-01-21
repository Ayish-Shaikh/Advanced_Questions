package Recursion_Github;

public class subset {
    public static void main(String[] args) {
        String v = "ABC";
        subset(v,"",0);
    }
    public static void subset(String str, String r, int counter){
        if (counter == str.length()){
            System.out.println(r);
            return;
        }
        subset(str, r, counter+1);
        subset(str, r + str.charAt(counter), counter+1);
    }
}
