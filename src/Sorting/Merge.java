package Sorting;

public class Merge {
    public static void MergeSort(int[] arr, int low , int high){
        if (low < high) {
            int mid = (low + high) / 2;
            MergeSort(arr , low , mid);
            MergeSort(arr , mid+1 , high);
            merge(arr , low , mid , high);
        }

    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid ;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for (int x = 0; x < n1; x++){
            lArr[x] = arr[low + x];
        }
        for (int x = 0; x < n2; x++){
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = low;

        //merging all the unsorted elements like [5,6] [2,3]
        while(i < n1 && j < n2){
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        //this part is merging all the elements of the remaining array and merging it
        while(i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (i < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        MergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}