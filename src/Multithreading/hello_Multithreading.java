package Multithreading;

public class hello_Multithreading {
//    public static void main(String[] args) {
//        world w = new world();
//        w.start();
//        for (int i = 0;i< 1000 ;i++ ) {
//            System.out.println("Hello");
//        }
//    }
//}
public static void main(String[] args) {
        world w = new world();
        Thread thread = new Thread(w);
        thread.start();
        for (int i = 0;i<1000 ;i++ ) {
            System.out.println("Hello");
        }
    }
}