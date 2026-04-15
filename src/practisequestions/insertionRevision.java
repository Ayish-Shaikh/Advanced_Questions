package practisequestions;

public class insertionRevision {
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        insertionSort(arr);

        System.out.println("sorted array: ");
        for (int num: arr){
            System.out.println(num + "");
        }
    }
}
