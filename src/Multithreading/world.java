package Multithreading;

//public class world extends Thread{
//    public void run() {
//        for (int i = 0;i<1000 ;i++ ) {
//            System.out.println("World");
//        }
//
//    }
//}
public class world implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i<1000 ;i++ ) {
            System.out.println("World");
        }
    }
}
