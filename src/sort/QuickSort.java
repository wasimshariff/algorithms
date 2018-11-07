package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String a[]) {

       int arr[] = {1, 99, 5, 66, 81, 111, 14, 45, 67, 4, 13,45,5};
       // int arr[] = {3,1,4,1,5,9,2,6,5,3};
        quickSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);

    }

    public static int partition(int[] arr, int start, int end) {
       int swap = start+1;
       int pivot = arr[start];
       int j = start + 1;
       int temp = 0;
       while( j <= end) {
           if( pivot > arr[j]) {
               temp = arr[j];
               arr[j] = arr[swap];
               arr[swap] = temp;
               swap++;
           }
           j++;
       }

       temp = arr[start];
       arr[start] = arr[swap-1];
       arr[swap-1] = temp;
       return swap-1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partition = partition(arr, low, high);

            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }
}
