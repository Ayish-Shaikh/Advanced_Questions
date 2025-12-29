package Sorting;

public class Quick {
      public static void QuickSort(int[] arr , int low , int high){
          //Method to perform quick sort
          if (low < high){
              int partitionIndex = partition(arr, low, high);
              QuickSort(arr, low, partitionIndex - 1);
              QuickSort(arr, partitionIndex + 1, high);
          }
      }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //choose last element as pivot
        int i = low - 1;

        //traverse the whole array
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot with element at arr[i+1]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr ={64, 25, 12, 22,11};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println("sorted array: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
