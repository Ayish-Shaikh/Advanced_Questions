package Sorting;

public class Insertion {
    public static void Inserion_Sort(int[] arr){
        int n = arr.length;

        for (int i = 1; i <n ; i++) {
            int j = i;
            while(j>0 && arr [j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        Inserion_Sort(arr);
        System.out.println("Sorted Array: ");
        for(int num: arr){
            System.out.println(num + " ");
        }
    }
}
