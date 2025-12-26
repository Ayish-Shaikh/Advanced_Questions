package Sorting;

public class BubbleSort {
    public static void Bubble_Sort(int[] arr){
        int n = arr.length;

        for (int i = n-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        Bubble_Sort(arr);

        System.out.println("Sorted Array: ");
        for(int num: arr){
            System.out.println(num+" ");
        }
    }
}
