package practisequestions;

public class selectionRevision {
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i= 0; i< n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j]< arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 8};
        selectionSort(arr);

        System.out.println("Sorted array: ");
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
