package Sorting;

public class Selection {
    public static void Selection_Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i; j < n - i; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        Selection_Sort(arr);

        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}